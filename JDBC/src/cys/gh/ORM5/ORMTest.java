package cys.gh.ORM5;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cys.gh.base.db.DB;

/*
 * 通过反射和元数据方式，将表映射成一个实体
 */
public class ORMTest {

	public static void main(String[] args) throws Exception{
		getUser("select * from user where id=?",new Object[]{1},User.class);
	}
	
	public static Object getUser(String sql,Object[] objs,Class clazz) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Object user = null;
		conn = DB.getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			/**
			 * 以下这段是利用元数据 为该参数（？）赋值
			 */
			ParameterMetaData pmd = pstmt.getParameterMetaData();//取出参数元数据
			int parameterConut = pmd.getParameterCount();//取出参数个数("?"的个数)
			for(int i=1;i<=parameterConut;i++){//为每个？赋值
				pstmt.setObject(i,objs[i-1]);
			}
			rs = pstmt.executeQuery();
			/**
			 * 以下这段是利用元数据，取得查询结果集中每个记录的列名集
			 */
			ResultSetMetaData rsmd = rs.getMetaData();
			List<String> columnNames = new ArrayList<String>();//存放列名的集合
			for(int i=1;i<=rsmd.getColumnCount();i++){
				columnNames.add(rsmd.getColumnName(i));
			}
			/**
			 * 以下这段是求要封装的类的setter方法（如 setId（）等方法id是与表的列名对应）
			 */
			Method[] methods = clazz.getMethods();
			user = clazz.newInstance();//创建这个对象
			//将从表中取出的值放入对应的实体中
			if(rs.next()){
				for(Method m : methods){
					for(int i=0;i<columnNames.size();i++){
						//当set和列名拼成的字符串与方法名相等时，就调用这个setter方法
						if(("set"+columnNames.get(i)).equalsIgnoreCase(m.getName())){
							//第一个参数是：要执行的方法所属的实例，第二个参数是：传递给这个方法的参数值
							m.invoke(user,rs.getObject(columnNames.get(i)));
						}
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			DB.free(rs, null, pstmt, conn);
		}
		return user;
	}
}
