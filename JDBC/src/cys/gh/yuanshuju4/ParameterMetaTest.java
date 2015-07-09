package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cys.gh.base.db.DB;

public class ParameterMetaTest {

	/**
	 * @param args
	 * ������Ԫ������Ϣ
	 */
	public static void main(String[] args) {
		read("select * from user where id=?",new Object[]{1});
	}
	/*
	 * ���Ը�һ����������һ��sql���
	 * ���ڷ����ڲ�ȡ�����sql�������ʲô������Ϣ
	 * �����ǣ�����Ϣ��select * from user where id>?�еĲ�����һ����
	 * ע�� ���ݿ���һ��Ҫ������sql�ַ����и����ı������籾����sql�еı�����user�������ݿ�����ʵ�ı����
	 */
	public static void read(String sql,Object[] p){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = DB.getConn();
			pstmt = conn.prepareStatement(sql);
			//ȡ��sql���Ĳ���Ԫ��Ϣ,�����ͷ�װ�˲���Ԫ��Ϣ
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			int count = pmd.getParameterCount();//ȡ��sql���м����������м������ţ�
		
			for(int i=1;i<=count;i++){//jdbc�е��±�һ���Ǵ�1��ʼ
//				System.out.print(pmd.getParameterClassName(i)+"\t");
//				System.out.print(pmd.getParameterTypeName(i)+"\t");
//				System.out.print(pmd.getParameterType(i)+"\t");
				pstmt.setObject(i,p[i-1]);//�������ÿ��������������ֵ
			}
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getObject("name"));
			}
			
		}catch(Exception e){
			
		}
	}

}
























