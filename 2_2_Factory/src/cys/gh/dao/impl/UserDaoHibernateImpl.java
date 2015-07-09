package cys.gh.dao.impl;

import cys.gh.dao.UserDao;
import cys.gh.domain.User;
/*
 * 用hibernate方式实现对数据库的访问
 */
public class UserDaoHibernateImpl implements UserDao {

	public void addUser(User user) {
		System.out.println("用hibernate方式实现对数据库的访问处理添加用户的操作！！");
	}

}
