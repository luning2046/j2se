package cys.gh.Date1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import cys.gh.base.db.DB;

public class InsertDate {

	public static void main(String[] args){
		
	}
	
	public static void ID(Date date) throws SQLException{
		Connection conn=DB.getConn();
		ResultSet rs =null;
		String sql = "insert into user(name,birthday,money) values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"cys");
		//参数date是java.util.Date；而数据库中的birthday的数据类型是java.sql.Date
		//所以插入时，要进行一个日期类型的转换 getTime是获取从1970年到现在的毫秒数
		pstmt.setDate(2,new java.sql.Date(date.getTime()));
		pstmt.setInt(3,1);
		int r = pstmt.executeUpdate();//返回值是表示 对几条记录进行了操作
	}
}















