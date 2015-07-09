package cys.gh.image3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import cys.gh.base.db.DB;
/*
 * ��Ŷ������ļ�  ��mysql�д�Ŷ������ļ���������blob
 * rs.getBlob(1);��ȡ
 */
public class TestBinnary {

	public static void bigText() throws Exception{
		Connection conn=DB.getConn();
		String sql = "insert into bigText(content) values(?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		File file = new File("c://bsmain_runtime.jpg");
		InputStream reader = new BufferedInputStream(new FileInputStream(file));
		
		pstmt.setBinaryStream(1, reader, (int)file.length());
		
		pstmt.executeUpdate();
		reader.close();
		DB.free(null,null, pstmt, conn);
	}
}
