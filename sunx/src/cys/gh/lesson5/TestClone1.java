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
 * Ҫ���п�¡���� ����ʵ��Cloneable�ӿ�
 * �˽ӿ�û���κη��� ֻ���𵽱�ʶ����
 */
class User implements Cloneable{
	int id;
	String name;
	
	User(int id,String name){
		this.id=id;
		this.name=name;
	}

	//��д��Object���clone����
	public Object clone() throws CloneNotSupportedException {
		Object o=null;
		o=super.clone();
		return o;
	}
	
}
