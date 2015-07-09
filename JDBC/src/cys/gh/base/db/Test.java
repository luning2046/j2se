package cys.gh.base.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws Exception{
		Connection conn = DB.getConn();
		PreparedStatement pstmt = conn.prepareStatement("select * from person where id=?");
		pstmt.setInt(1,2);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString(1));
		}
	}
}
