package cys.gh.dao.impl;

import cys.gh.dao.UserDao;
import cys.gh.domain.User;
/*
 * 用jdbc方式实现对数据库的访问
 */
public class UserDaoJdbcImpl implements UserDao {

	public void addUser(User user) {
		System.out.println("用jdbc方式实现对数据库的访问处理添加用户的操作！！");
	}

}
