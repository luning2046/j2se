package cys.gh.factory;

import java.io.FileInputStream;
import java.util.Properties;

import cys.gh.dao.UserDao;
/*
 * �õ���ģʽ������������� 
 * ��ͨ����ȡ�����ļ�������һ���ӿ�UserDao��ʵ�ֶ���
 */
public class DaoFactory {

	private UserDao userDao=null;
	
	/*
	 * ��ʼ��ʱ ��ȡ�����ļ��������ӿ�UserDao��һ��ʵ����Ķ���
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
	 * ��ȡ�����ļ� �õ�һ���ӿ�UserDao��һ������ʵ�����ȫ��
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
	 * ͨ�����䴴��һ��UserDaoJdbcImpl����
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
