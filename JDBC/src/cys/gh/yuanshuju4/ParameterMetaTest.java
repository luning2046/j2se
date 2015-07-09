package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cys.gh.base.db.DB;

public class ParameterMetaTest {

	/**
	 * @param args
	 * 参数的元数据信息
	 */
	public static void main(String[] args) {
		read("select * from user where id=?",new Object[]{1});
	}
	/*
	 * 测试给一个方法传递一个sql语句
	 * 而在方法内部取得这个sql语句中有什么参数信息
	 * （既是？号信息如select * from user where id>?中的参数是一个）
	 * 注意 数据库中一定要有与在sql字符串中给定的表名（如本例中sql中的表名是user）在数据库有真实的表存在
	 */
	public static void read(String sql,Object[] p){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = DB.getConn();
			pstmt = conn.prepareStatement(sql);
			//取得sql语句的参数元信息,这个类就封装了参数元信息
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//取得sql中有几个参数（有几个？号）
		
			for(int i=1;i<=count;i++){//jdbc中的下标一般是从1开始
//				System.out.print(pmd.getParameterClassName(i)+"\t");
//				System.out.print(pmd.getParameterTypeName(i)+"\t");
//				System.out.print(pmd.getParameterType(i)+"\t");
				pstmt.setObject(i,p[i-1]);//用数组给每个参数（？）赋值
			}
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getObject("name"));
			}
			
		}catch(Exception e){
			
		}
	}

}
























