package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

import cys.gh.base.db.DB;
/**
 * ����ѯ�������װ��һ��map��key��ʾ��ѯ����¼��
 * �ֶ��� value��ʾ�ֶ����е�ֵ
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
			//��װ�˲�ѯ�����Ԫ��Ϣ ���ѯ�����ټ�¼��ÿ���ֶε�����
			//ResultSetMetaData�൱��һ��map�������һ��key-value��
			ResultSetMetaData rsmd = rs.getMetaData();
			int cc = rsmd.getColumnCount();//����ļ�¼��
			String[] columnName = new String[cc];//ȡ�����е���������������
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















