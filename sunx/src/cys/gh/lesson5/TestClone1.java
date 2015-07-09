package cys.gh.lesson5;

public class TestClone1 {
	public static void main(String[] args) throws CloneNotSupportedException{
		User u1= new User(1,"cys");
		User u2 = (User)u1.clone();
		System.out.println(u1.name);
		System.out.println(u2.name);
		u2.name="gh";
		System.out.println(u1.name);
		System.out.println(u2.name);
	}
	
}
/*
 * 要进行克隆操作 必须实现Cloneable接口
 * 此接口没有任何方法 只是起到标识作用
 */
class User implements Cloneable{
	int id;
	String name;
	
	User(int id,String name){
		this.id=id;
		this.name=name;
	}

	//重写的Object类的clone方法
	public Object clone() throws CloneNotSupportedException {
		Object o=null;
		o=super.clone();
		return o;
	}
	
}
