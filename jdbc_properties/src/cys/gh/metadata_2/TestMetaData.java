package cys.gh.metadata_2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import cys.gh.base.db.DB;

/*
 * ������ݿ��Ԫ����
 * Ԫ���ݣ�metadata���������統ǰ���ݿ��������Ϣ�ˣ�
 * 		��Ľṹ�� ����Ϣ
 */
public class TestMetaData {

	public static void main(String[] args){
		Connection conn=DB.getConn();
		ResultSet rs = null;
		try {
			//���Ԫ����
			DatabaseMetaData dmd = conn.getMetaData();
			if(dmd!=null){
				System.out.println("���ݿ����ƣ�"+dmd.getDatabaseProductName());
				System.out.println("���ݿ�汾��"+dmd.getDatabaseProductVersion());
				System.out.println("���ݿ���������"+dmd.getDriverName());
				System.out.println("��������汾�ţ�"+dmd.getDriverVersion());
				System.out.println("�������ʵ��û�������"+dmd.getMaxConnections());
				System.out.println("���������б�");
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































