package cys.gh.typeInverse;
/*
 * ��������ת��������
 */
public class Test {

	public static void main(String[] args){
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		a1 = a2;//���ԣ�ͬʱָ��Animal�����Ժͷ���
		Bird b = (Bird)a1;//����
		Dog d = (Dog)a2;//d = b;����������
		int age = d.age;//d.age=100;������
	}
}

interface Animal{
	//�ڽӿ��б��������ֶ����Ǳ����
	public  static final int age=10;
	
	public abstract void eat();
	//Ĭ�ϵ����η�ǰ׺�� public abstrace
	void breathe();
}

class Dog implements Animal{
	public void breathe() {
		System.out.println("dog is breathing !!");
	}
	public void eat() {
		System.out.println("dog is eatting !!");
	}
	public void song(){
		System.out.println("wangwang !!");
	}
}
class Bird implements Animal{
	public void breathe() {
		System.out.println("bird is breathing !!");
	}
	public void eat() {
		System.out.println("bird is eatting !!");
	}
	public void fly(){
		System.out.println("bird is flying !!");
	}
}
