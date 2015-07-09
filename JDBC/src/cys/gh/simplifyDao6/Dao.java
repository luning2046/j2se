package cys.gh.simplifyDao6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cys.gh.base.db.DB;

/*
 * ʹÿ��dao�Ĳ����򻯣���userDaoʹ�������ظ����룩
 */
public abstract class Dao {
	/*
	 * �޸ķ���
	 * @param sql��ʾִ�и��µ�sql���
	 * @param objs��ʾ��sql����в�������������ֵ
	 * @return ���ظ��²���Ӱ���˶�����
	 */
	public int update(String sql,Object[] objs){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rows;
		
		conn =DB.getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i=0;i<objs.length;i++){
				pstmt.setObject(i+1,objs[i]);
			}
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			DB.free(null,null, pstmt, conn);
		}
		return rows;
	}
	/*
	 * ��ѯ
	 * @param sql��ʾִ�в�ѯ��sql���
	 * @param objs��ʾ��sql����в�������������ֵ
	 * @param clazz��ʾҪ��ѯ���Ӧ�Ķ���
	 * @return ���ظ��²���Ӱ���˶�����
	 */
	public List<Object> find(String sql,Object[] objs){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Object> ret_objs = new ArrayList<Object>();
		conn =DB.getConn();
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i=0;i<objs.length;i++){
				pstmt.setObject(i+1,objs[i]);
			}
			rs = pstmt.executeQuery();
			while(rs.next()){
				ret_objs.add(mappingObj(rs));
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally{
			DB.free(null,null, pstmt, conn);
		}
		return ret_objs;
	}
	//���ڽ���ѯ�����װ��һ�����󲢷��أ��о����������ʵ��
	public abstract Object mappingObj(ResultSet rs);
	
}
