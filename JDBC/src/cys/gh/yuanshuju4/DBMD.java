package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import cys.gh.base.db.DB;

/**
 * 
 * @author Administrator
 * ���ݿ��Ԫ��Ϣ���������ݿ�������Ϣ�磺���ݿ�汾�����ݿ�����
 * 				���ݿ⳧����Ϣ���Ƿ�֧�������Ƿ�֧��ĳ������ĸ��뼶��
 * 				�Ƿ�֧�ֹ���������ȡ�
 */
public class DBMD {

	public static void main(String[] args) throws Exception {
		Connection conn = DB.getConn();
		/*
		 * �����ͷ�װ�����ݿ��Ԫ��Ϣ
		 */
		DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());//���ݿ�Ĳ�Ʒ��
		System.out.println(dbmd.supportsTransactions());//���ֲ�Ʒ�����ݿ��Ƿ�֧������
		conn.close();
	}
}
