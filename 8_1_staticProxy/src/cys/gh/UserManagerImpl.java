package cys.gh;
/*
 * 这是一个业务逻辑的基本操作 但要给各个方法在执行前
 * 进行一下安全性的检查 用一个静态的代理类实现此功能 更好一些没。
 */
public class UserManagerImpl implements UserManager{

	public void add(String name, String password) {
		System.out.println("--------UserManagerImpl.add--------");
	}

	public void delete(int id) {
		System.out.println("--------UserManagerImpl.delete--------");
	}

	public String get(int id) {
		System.out.println("--------UserManagerImpl.get--------");
		return null;
	}

	public void update(int id) {
		System.out.println("--------UserManagerImpl.update--------");
	}

}
