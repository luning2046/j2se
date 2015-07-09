package cys.gh;

public class Client {

	public static void main(String[] args) {
		UserManager um = new UserManagerStaticProxy(new UserManagerImpl());
		um.add("cys","234");
	}

}
