package cys.gh.insert_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cys.gh.base.db.DB;

public class TestInsert {

	public static void main(String[] args) {
		String sql = "insert into user values(1,'cys',26)";
		Connection conn = DB.getConn();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.free(null,null, pstmt, conn);
		}
		
	}
}
