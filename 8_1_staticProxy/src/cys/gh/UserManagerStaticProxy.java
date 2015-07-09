package cys.gh;

public class UserManagerStaticProxy implements UserManager {

	private UserManager um;
	
	UserManagerStaticProxy(UserManager um){
		this.um=um;
	}
	
	public void add(String name, String password) {
		this.checkSecurity();
		um.add(name, password);
	}

	public void delete(int id) {
		this.checkSecurity();
		um.delete(id);
	}

	public String get(int id) {
		this.checkSecurity();
		return um.get(id);
	}

	public void update(int id) {
		this.checkSecurity();
		um.update(id);
	}
	//�����鰲ȫ�ԵĴ��루��̬��������
	public void checkSecurity(){
		System.out.println("-----------checkSecurity--------------");
	}
}
