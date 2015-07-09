package cys.gh.yuanshuju4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import cys.gh.base.db.DB;

/**
 * 
 * @author Administrator
 * 数据库的元信息：既是数据库的相关信息如：数据库版本、数据库名、
 * 				数据库厂商信息、是否支持事务、是否支持某种事务的隔离级别
 * 				是否支持滚动结果集等。
 */
public class DBMD {

	public static void main(String[] args) throws Exception {
		Connection conn = DB.getConn();
		/*
		 * 这个类就封装的数据库的元信息
		 */
		DatabaseMetaData dbmd = conn.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());//数据库的产品名
		System.out.println(dbmd.supportsTransactions());//此种产品的数据库是否支持事务
		conn.close();
	}
}
