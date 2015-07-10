package cys.gh.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 测试proxy的功能:就是动态的在运行期创建一个字节码
 */
public class TestProxy_1 {

	public static void main(String[] args){
		//getProxyClass这个静态方法 就是动态的在运行期创建一个字节码
		//这个方法的   参数1是 指定一个类加载器   一般这个类加载器  是和这个接口的类加载器一样的
		//				为什么要提供一个类加载器呢？因为任何一个类都要有一个类加载器  动态生成的这个类也不例外 
		//			 参数2是给要生成的字节码必须提供一个接口，当然生成的这个类  必然也是实现了接口aaa的类
		Class clazz = Proxy.getProxyClass(aaa.class.getClassLoader(),aaa.class);
		System.out.println("动态生成的这个类的名字是："+clazz.getName());
		
		System.out.println("============================构造方法===================================");
		//查看这个动态生成的类的构造方法
		Constructor[] cs = clazz.getConstructors();
		for(Constructor c : cs){
			System.out.println("构造方法名"+c.getName());//构造方法名  输出结果可以看出这个类只有一个参数的构造方法
			
			//构造方法参数类型
			Class[] cps = c.getParameterTypes();
			System.out.print("构造方法参数类型有：");//参数是java.lang.reflect.InvocationHandler
			for(Class cp : cps){
				System.out.print(cp.getName()+",");
			}
			System.out.println();
		}
		System.out.println("=============================方法==================================");
		//查看这个动态生成的类的一般方法
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m : ms){
			System.out.println("方法名"+m.getName());//方法名
			
			//方法参数类型
			Class[] mps = m.getParameterTypes();
			System.out.print("方法参数类型有：");
			for(Class mp : mps){
				System.out.print(mp.getName()+",");
			}
			System.out.println();
			
			//方法的返回值
			Class rt = m.getReturnType();
			System.out.println("方法的返回值"+rt.getName());
		}
	}
}

interface aaa{
	public void cc();
	public void dd(int a,String b);
}

