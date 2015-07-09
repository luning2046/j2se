package cys.gh.Excel_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccessExcelByJdbc_Odbc {

	/**ͨ��JDBC-ODBC����Excel�ļ��е�����
	 * ��Ҫ����JDBC-ODBC����Դ
	 */
	public static void main(String[] args) {
		//jdbc-odbc����������
		String DBDRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
		try{
			Class.forName(DBDRIVER);
			//������jdbc-odbc��URL���������������û��������� 
			//��Ϊ��Excel���ݸ�ʽ ����û���û��������� Ϊ��
			Connection con = DriverManager.getConnection("jdbc:odbc:ExcelODBC1","","");
			String sql = "select * from [Sheet1$]";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getString(3));
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}



























