package cys.gh.ORM5;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cys.gh.base.db.DB;

/*
 * ͨ�������Ԫ���ݷ�ʽ������ӳ���һ��ʵ��
 */
public class ORMTest {

	public static void main(String[] args) throws Exception{
		getUser("select * from user where id=?",new Object[]{1},User.class);
	}
	
	public static Object getUser(String sql,Object[] objs,Class clazz) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Object user = null;
		conn = DB.getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			/**
			 * �������������Ԫ���� Ϊ�ò�����������ֵ
			 */
			ParameterMetaData pmd = pstmt.getParameterMetaData();//ȡ������Ԫ����
			int parameterConut = pmd.getParameterCount();//ȡ����������("?"�ĸ���)
			for(int i=1;i<=parameterConut;i++){//Ϊÿ������ֵ
				pstmt.setObject(i,objs[i-1]);
			}
			rs = pstmt.executeQuery();
			/**
			 * �������������Ԫ���ݣ�ȡ�ò�ѯ�������ÿ����¼��������
			 */
			ResultSetMetaData rsmd = rs.getMetaData();
			List<String> columnNames = new ArrayList<String>();//��������ļ���
			for(int i=1;i<=rsmd.getColumnCount();i++){
				columnNames.add(rsmd.getColumnName(i));
			}
			/**
			 * �����������Ҫ��װ�����setter�������� setId�����ȷ���id������������Ӧ��
			 */
			Method[] methods = clazz.getMethods();
			user = clazz.newInstance();//�����������
			//���ӱ���ȡ����ֵ�����Ӧ��ʵ����
			if(rs.next()){
				for(Method m : methods){
					for(int i=0;i<columnNames.size();i++){
						//��set������ƴ�ɵ��ַ����뷽�������ʱ���͵������setter����
						if(("set"+columnNames.get(i)).equalsIgnoreCase(m.getName())){
							//��һ�������ǣ�Ҫִ�еķ���������ʵ�����ڶ��������ǣ����ݸ���������Ĳ���ֵ
							m.invoke(user,rs.getObject(columnNames.get(i)));
						}
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			DB.free(rs, null, pstmt, conn);
		}
		return user;
	}
}
