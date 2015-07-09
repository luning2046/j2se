package cys.gh.zxx;

import java.lang.reflect.Method;

public class TestMethod_5 {

	public static void main(String[] args)throws Exception{
		String str = "cysgh";
		Class cls = str.getClass();
		//得到指定的函数 第一个参数是 函数名  第二个参数是 函数的参数类型
		Method m = cls.getMethod("charAt",int.class);
		//调用方法时，要指定某个对象和方法参数，如果是static方法则参数值null
		System.out.println(m.invoke(str,3));
		
	}
}
