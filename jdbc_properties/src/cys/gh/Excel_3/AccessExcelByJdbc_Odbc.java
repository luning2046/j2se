package cys.gh.Excel_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccessExcelByJdbc_Odbc {

	/**通过JDBC-ODBC访问Excel文件中的数据
	 * 先要配置JDBC-ODBC数据源
	 */
	public static void main(String[] args) {
		//jdbc-odbc的驱动程序
		String DBDRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
		try{
			Class.forName(DBDRIVER);
			//参数是jdbc-odbc的URL，后两个参数是用户名和密码 
			//因为是Excel数据格式 所有没有用户名和密码 为空
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



























