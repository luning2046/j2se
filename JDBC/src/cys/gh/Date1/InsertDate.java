package cys.gh.Date1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import cys.gh.base.db.DB;

public class InsertDate {

	public static void main(String[] args){
		
	}
	
	public static void ID(Date date) throws SQLException{
		Connection conn=DB.getConn();
		ResultSet rs =null;
		String sql = "insert into user(name,birthday,money) values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"cys");
		//����date��java.util.Date�������ݿ��е�birthday������������java.sql.Date
		//���Բ���ʱ��Ҫ����һ���������͵�ת�� getTime�ǻ�ȡ��1970�굽���ڵĺ�����
		pstmt.setDate(2,new java.sql.Date(date.getTime()));
		pstmt.setInt(3,1);
		int r = pstmt.executeUpdate();//����ֵ�Ǳ�ʾ �Լ�����¼�����˲���
	}
}















