package cys.gh.test1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 与TestProxy_2例子一样 创建自动生成的字节码文件的对象
 * 只是 本例通过 Proxy的另一个方法实现的
 */
public class TestProxy_3 {

	public static void main(String[] args) throws Exception{
		//这个方法就是实现了与上面两例的实现的相同功能  就是动态生成一个类  并实例化这个类
		DDD d = (DDD)Proxy.newProxyInstance(DDD.class.getClassLoader(),//类加载器
							   new Class[]{DDD.class},//动态生成的类要实现的接口,因为可以实现多个接口 ，所以是数组
							   new InvocationHandler() {//
									public Object invoke(Object proxy, Method method, Object[] args)
											throws Throwable {
										return null;
									}
							});
		
		System.out.println(d);
	}
}

interface DDD{
	public void cc();
	public void dd(int a,String b);
}

