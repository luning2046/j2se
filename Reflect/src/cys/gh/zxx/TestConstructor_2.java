package cys.gh.zxx;

import java.lang.reflect.Constructor;

/*
 * 程序分为编译时错误和运行时错误
 */
public class TestConstructor_2 {

	public static void main(String[] args) throws Exception {

		Class cls = String.class;
		//String s = (String)cls.newInstance();//用无参构造方法创建对象
		
		//得到指定参数的构造函数,因为String类有好多构造方法，怎么才能得到一个
		//指定的构造方法呢，就是在这个函数getConstructor()中指定构造函数的参数（参数个数，参数类型）
		//本例中就是得到 String（StringBuffer sb）构造方法
		Constructor constructor = cls.getConstructor(StringBuffer.class);
		
		//用构造方法创建一个对象
		String str1 = (String)constructor.newInstance(new StringBuffer("cys"));
		//又用构造方法创建一个对象
		String str2 = (String)constructor.newInstance(new StringBuffer("cys"));
		System.out.println(str1.toString());
	}
}
