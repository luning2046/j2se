package cys.gh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {

	/**
	 * 测试反射
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
		/*1.用反射 加载Person类，得到其Class对象clazz；
		 * 	加载时会执行被加载的静态代码块
			对静态变量进行初始化
		*/
		Class clazz = Class.forName("cys.gh.Person");
		System.out.println("----------------------------------------------------");
		/*
		 * 2.由clazz可以创建对象：若调用newInstance（）方法创建对象是要求被加载的类由一个
				无参数构造器
		 */
		Object o = clazz.newInstance();//此时o指向一个Person类的对象
		Person p = (Person)o;
		p.setAddress("fushun");//此时就可以操作Person对象了
		System.out.println(p.getAddress());
		System.out.println("----------------------------------------------------");
		/*
		 * 3.利用Class对象clazz就可以得到该类Person的所有方法
		 * Method类是java.lang.reflech包下的类
		 * Method 提供关于类或接口上单独某个方法（以及如何访问该方法）的信息。
		 * 						所反映的方法可能是类方法或实例方法（包括抽象方法）。
		 * getMethods()得到所有非private的所有方法，包括其祖先类中的方法
		 * getDeclareMethods（）得到所有方法包括private，但不能的到祖先类中的方法 
		 */
		Method[] methods = clazz.getMethods();
		for(Method method:methods){
			System.out.println("Person类的方法名："+method.getName());//包括它继承来的方法
		}
		System.out.println("----------------------------------------------------");
		/*
		 * 4.利用Class对象clazz就可以得到该类Person的所有方法，所有成员变量
		 */
		//Field[] fields = clazz.getFields();获取非私有的成员变量
		Field[] fields = clazz.getDeclaredFields();//获取所有的成员变量
		for(Field field:fields){
			System.out.println("Person类的成员变量名："+field.getName());//包括它继承来的成员变量
		}
		System.out.println("----------------------------------------------------");
		
		/*
		 * 5.利用Class对象clazz就可以得到该类Person的所有的构造方法
		 * Constructor con = clazz.getConstructor(String.class);得到指定参数的构造方法
		 * Object o = con.newInstance("cys");用指定的构造方法创建一个实例
		 */
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor:constructors){
			System.out.println("Person类的构造方法："+constructor.getName());//包括它继承来的构造方法
		}
		System.out.println("----------------------------------------------------");
		/*
		 * 6.利用Class对象clazz就可以得到该类Person的父类
		 */
		Class superClazz = clazz.getSuperclass();
		System.out.println("Person的父类"+superClazz.getName());
		System.out.println("----------------------------------------------------");

		/*
		 * 7.获取当前类实现的接口
		 */
		Class[] interfaceClazzs = clazz.getInterfaces();
		for(Class interfaceclazz:interfaceClazzs){
			System.out.println(interfaceclazz.getName());
		}
		System.out.println("----------------------------------------------------");

		/*
		 * 8.获取方法并让方法执行
		 */
		Method method = clazz.getMethod("test", null);//第一个参数是方法名；第二个参数是方法的参数类型
		method.invoke(o,null);//第一个参数是对象名；第二个参数是方法的参数值
	}

}



















