package cys.gh.metadata_2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import cys.gh.base.db.DB;

/*
 * 获得数据库的元数据
 * 元数据（metadata）：就是如当前数据库的配置信息了，
 * 		表的结构了 等信息
 */
public class TestMetaData {

	public static void main(String[] args){
		Connection conn=DB.getConn();
		ResultSet rs = null;
		try {
			//获得元数据
			DatabaseMetaData dmd = conn.getMetaData();
			if(dmd!=null){
				System.out.println("数据库名称："+dmd.getDatabaseProductName());
				System.out.println("数据库版本："+dmd.getDatabaseProductVersion());
				System.out.println("数据库驱动程序："+dmd.getDriverName());
				System.out.println("驱动程序版本号："+dmd.getDriverVersion());
				System.out.println("并发访问的用户个数："+dmd.getMaxConnections());
				System.out.println("数据类型列表：");
				rs = dmd.getTypeInfo();
				while(rs.next()){
					System.out.println("\t"+rs.getString(1));
				}
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.free(null,null, null, conn);
		}
	}
}































