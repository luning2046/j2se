package cys.gh.lesson4_1;

/*
 * 匿名内部类的使用
 */
interface Animal1{
	void eat();
	void sleep();
}

class Zoo1{
	
	public Animal1 getAnimal(){
		
		
		/*
		 * 所谓的匿名的内部类：就是一个接口没有显示的用implement关键字被一个类实现
		 * 而是直接 new 接口名(){
		 * 		这里直接实现接口的函数
		 * }
		 */
		//这个就是匿名内部类的定义
		return new Animal1(){
			
			public void eat() {
				System.out.println("tiger eat!");
			}
			public void sleep() {
				System.out.println("tiger sleep!");	
			}
		};
	}
}

public class ImplementTest2 {
	public static void main(String[] args){
		Zoo1 z = new Zoo1();
		Animal1 animal1 = z.getAnimal();
		animal1.eat();
		animal1.sleep();
	}
}
