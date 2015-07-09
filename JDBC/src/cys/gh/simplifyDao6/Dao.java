package cys.gh.simplifyDao6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cys.gh.base.db.DB;

/*
 * 使每个dao的操作简化（如userDao使它减少重复代码）
 */
public abstract class Dao {
	/*
	 * 修改方法
	 * @param sql表示执行更新的sql语句
	 * @param objs表示给sql语句中参数（？）赋的值
	 * @return 返回更新操作影响了多少行
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
	 * 查询
	 * @param sql表示执行查询的sql语句
	 * @param objs表示给sql语句中参数（？）赋的值
	 * @param clazz表示要查询表对应的对象
	 * @return 返回更新操作影响了多少行
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
	//用于将查询结果封装成一个对象并返回，有具体的子类来实现
	public abstract Object mappingObj(ResultSet rs);
	
}
