package cys.gh.factory;

import java.io.FileInputStream;
import java.util.Properties;

import cys.gh.dao.UserDao;
/*
 * 用单例模式定义这个工厂类 
 * 且通过读取配置文件来创建一个接口UserDao的实现对象
 */
public class DaoFactory {

	private UserDao userDao=null;
	
	/*
	 * 初始化时 读取配置文件并创建接口UserDao的一个实现类的对象
	 */
	private DaoFactory(){
		String className = readConfig();
		newInstanceByReflect(className);
	}
	
	private static DaoFactory df = new DaoFactory();
	
	public static DaoFactory getDaoFactoryInstance(){
		return df;
	}
	
	public UserDao getInstance(){
		return userDao;
	}
	/*
	 * 读取配置文件 得到一个接口UserDao的一个具体实现类的全名
	 */
	public String readConfig(){
		Properties p = new Properties();
		try{
			FileInputStream file = new FileInputStream("daoConfig.properties");
			p.load(file);
		}catch(Exception e){
			throw new ExceptionInInitializerError(e);
		}
		String userDaoJdbcClass = p.getProperty("userDaoJdbcClass");
		return userDaoJdbcClass;
	}
	/**
	 * 通过反射创建一个UserDaoJdbcImpl对象
	 */
	public void newInstanceByReflect(String className){
		Class clazz=null;
		try {
			clazz = Class.forName(className);
			userDao = (UserDao)clazz.newInstance();
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}
}
