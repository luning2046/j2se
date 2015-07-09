package cys.gh.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 创建自动生成的字节码文件的对象
 */
public class TestProxy_2 {

	public static void main(String[] args) throws Exception{
		
		Class clazz = Proxy.getProxyClass(EEE.class.getClassLoader(),EEE.class);
		
		Constructor[] cs = clazz.getConstructors();
		for(Constructor c : cs){
			//构造方法参数类型  通过输出结果可以看出这个类只有一个构造方法
			//且这个构造方法的参数只有一个  类型是java.lang.reflect.InvocationHandler
			//InvocationHandler是一个接口
			Class[] cps = c.getParameterTypes();
			System.out.print("构造方法参数类型有：");//参数是java.lang.reflect.InvocationHandler
			for(Class cp : cps){
				System.out.print(cp.getName()+",");
			}
			System.out.println();
		}
		
		
		//下面是创建这个类的对象
		//因为 InvocationHandler是一个接口 所以下面要创建一个实现这个接口的类  
		class MyInvocationHandler implements InvocationHandler{

			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return null;
			}
		}
		//根据指定参数类型得到一个构造方法
		Constructor c = clazz.getConstructor(MyInvocationHandler.class);
		//用得到的这个构造方法实例化一个对象
		EEE e = (EEE)c.newInstance(new MyInvocationHandler());
	}
}

interface EEE{
	public void cc();
	public void dd(int a,String b);
}

