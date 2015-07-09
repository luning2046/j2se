package cys.gh.client;

import cys.gh.dao.UserDao;
import cys.gh.domain.User;
import cys.gh.factory.DaoFactory;

public class Client {

	public static void main(String[] args){
		UserDao ud = DaoFactory.getDaoFactoryInstance().getInstance();
		ud.addUser(new User(1,"cys","123"));
	}
}
