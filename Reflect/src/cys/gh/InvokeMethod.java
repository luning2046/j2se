package cys.gh;

import java.lang.reflect.Method;

public class InvokeMethod {

	/**
	 * 调用并执行一个方法
	 */
	public static void main(String[] args) {
		invokeMethod(new User(2,"gh"));
	}
	
	public static void invokeMethod(Object obj){
		/**
		 * 因为每个类（如User)都重写了Object中的getClass方法
		 * 根据多态的原理，都是执行了子类的getClass方法（如User）
		 */
		Method[] ms = obj.getClass().getDeclaredMethods();
		for(Method m : ms){
			System.out.println(m.getName());
			//m.invoke(arg0, arg1)
		}
	}
}
