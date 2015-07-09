package cys.gh.myselfdefine_2;
/*
 * 泛型类T表示可变的数据类型 定义对象时在指定T是什么具体的类型
 * 自定义的泛型类
 */
public class Person<T>{
	private final int id;
	private T secrecy;
	
	public Person(int id){
		this.id=id;
	}
	public void setSecrecy(T t){
		secrecy=t;
	}
	public T getSecrecy(){
		return secrecy;
	}
	
	/**
	 * 将泛型定义在方法上
	 */
	public <W> void show(W w){
		
	}
	/**
	 *当方法静态时，不能访问类上定义的泛型。如果
	 *静态方法是用泛型，只能将泛型定义在方法上
	 */
//	public static void method(T t){
//		
//	}
	public  static <Y> void method(Y y){
		
	}
	
	
}
