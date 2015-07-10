package cys.gh;

public class Client {

	public static void main(String[] args) {
		SecurityHandler handler = new SecurityHandler();//´úÀíÀà
		UserManager um = (UserManager)handler.newProxy(new UserManagerImpl());
		um.add("cys","123");
	}

}
