package cys.gh.typeInverse;
/*
 * 测试类型转换的问题
 */
public class Test {

	public static void main(String[] args){
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		a1 = a2;//可以，同时指向Animal的属性和方法
		Bird b = (Bird)a1;//可以
		Dog d = (Dog)a2;//d = b;这样不可以
		int age = d.age;//d.age=100;不可以
	}
}

interface Animal{
	//在接口中变量的这种定义是必须的
	public  static final int age=10;
	
	public abstract void eat();
	//默认的修饰符前缀是 public abstrace
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
