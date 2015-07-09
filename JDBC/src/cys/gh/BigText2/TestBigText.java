package cys.gh.BigText2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import cys.gh.base.db.DB;

/*
 * 测试存取大文本数据类型，只能放纯文本格式
 * rs.getClob(1)读出大文本类型数据的方法
 * 有一张表 create table bigText (
 * 			content TEXT 打文本类型
 * 			);
 */
public class TestBigText {
	
	public static void bigText() throws Exception{
		Connection conn=DB.getConn();
		String sql = "insert into bigText(content) values(?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		File file = new File("c://bsmain_runtime.log");
		Reader reader = new BufferedReader(new FileReader(file));
		pstmt.setCharacterStream(1, reader, (int)file.length());
		pstmt.executeUpdate();
		reader.close();
		DB.free(null,null, pstmt, conn);
	}
}














