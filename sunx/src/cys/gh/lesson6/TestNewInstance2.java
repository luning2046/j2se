package cys.gh.lesson6;

import java.lang.reflect.Method;

public class TestNewInstance2 {

	
	public static void main(String[] args) throws Exception {
		//先加载类User
		Class clazz = Class.forName("cys.gh.lesson6.User");
		
		/*
		 * 用缺省的无参构造函数，构造User的对象,
		 * 用Object引用指向这个User对象
		*/
		Object obj = clazz.newInstance();
		System.out.println(clazz.getName());
		//获得这个类的所有方法
		Method[] ms = clazz.getDeclaredMethods();
		//让这个方法执行第一个参数 类对象 ，第二个参数是函数参数
		ms[0].invoke(obj,null);
	}
}
