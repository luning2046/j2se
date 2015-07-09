package cys.gh.lesson4_1;

/*
 * 本例是内部类的一个使用场景：
 * 	   用内部类实现一个接口，且将该内部类定义成private的，这样就能隐藏实现细节
 *	   因为  一般的实现接口的类，只能将该类用  public或默认修饰符  修饰，那么其他的类
 *     就能直接引用这个类，也就知道它的实现细节了
 *     
 */
interface Animal{
	void eat();
	void sleep();
}

class Zoo{
	//这个类在Zoo类之外 不能被实例化了，其他类就不能直接new这个Tiger类，也就隐藏了这个类的实现细节
	private class Tiger implements Animal{
		
		public void eat() {
			System.out.println("tiger eat!");
		}
		public void sleep() {
			System.out.println("tiger sleep!");	
		}
	}
	
	public Animal getAnimal(){
		return new Tiger();
	}
}

public class ImplementTest1 {
	public static void main(String[] args){
		Zoo z = new Zoo();
		Animal animal = z.getAnimal();
		animal.eat();
		animal.sleep();
	}
}
