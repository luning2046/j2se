package cys.gh.base.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	/**
	 * oracle.jdbc.driver.OracleDriver
	 * jdbc:oracle:thin:@localhost:5560:mldn
	 * oracle JDBC�����������λ�ã�oracle\ora90\jdbc\lib\classes12.jar
	 */
	private static final String DBURL="jdbc:mysql://localhost/test?user=root&password=root";
	private static final String DBDRIVER="com.mysql.jdbc.Driver";
	private static Connection conn = null;
	
	static{
		try {
			Class.forName(DBDRIVER);
			conn=DriverManager.getConnection(DBURL);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��������
	 * @return
	 */
	public static Connection getConn(){
		return conn;
	}
	/**
	 * �ͷ���Դ 
	 * @param rs
	 * @param state
	 * @param conn
	 */
	public static void free(ResultSet rs,Statement state,PreparedStatement pstmt ,Connection conn){
		if(rs!=null){
			try {
				rs.close();
				rs=null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(state!=null){
			try {
				state.close();
				state=null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null){
			try{
				pstmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
				conn=null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
