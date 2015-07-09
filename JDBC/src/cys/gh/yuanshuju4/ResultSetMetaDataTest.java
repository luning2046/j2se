package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

import cys.gh.base.db.DB;
/**
 * 将查询结果集封装到一个map中key表示查询出记录的
 * 字段名 value表示字段名中的值
 */
public class ResultSetMetaDataTest {

	
	public static void main(String[] args) {
		Map<String,Object> map= read("select * from user where id=1");
		System.out.println(map);
	}
	
	public static Map<String,Object> read(String sql){
		Map<String,Object> map = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = DB.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//封装了查询结果的元信息 如查询出多少记录，每个字段的类型
			//ResultSetMetaData相当于一个map，存放了一个key-value对
			ResultSetMetaData rsmd = rs.getMetaData();
			int cc = rsmd.getColumnCount();//查出的记录数
			String[] columnName = new String[cc];//取出所有的列名放入数组中
			for(int i=1;i<=cc;i++){
//				System.out.print(rsmd.getColumnClassName(i)+"\t");
//				System.out.print(rsmd.getColumnName(i)+"\t");
//				System.out.println();
				columnName[i-1]=rsmd.getColumnName(i);
			}		
			if(rs.next()){
				 map = new HashMap<String,Object>();
				for(int i=0;i<columnName.length;i++){
					
					map.put(columnName[i],rs.getObject(columnName[i]));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
}















