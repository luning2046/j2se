package cys.gh.dao.impl;

import cys.gh.dao.UserDao;
import cys.gh.domain.User;
/*
 * ��hibernate��ʽʵ�ֶ����ݿ�ķ���
 */
public class UserDaoHibernateImpl implements UserDao {

	public void addUser(User user) {
		System.out.println("��hibernate��ʽʵ�ֶ����ݿ�ķ��ʴ�������û��Ĳ�������");
	}

}
