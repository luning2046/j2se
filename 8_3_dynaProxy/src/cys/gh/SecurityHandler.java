package cys.gh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object targetOjbect;//被代理的对象(目标对象) 本例中式UserManagerImpl类
	
	public Object newProxy(Object targetObject){
		
		this.targetOjbect = targetObject;
		//创建代理类 需要三个参数
		return Proxy.newProxyInstance(
					targetObject.getClass().getClassLoader(),//目标对象的类加载器 本例为UserManagerImpl类的加载器
					targetObject.getClass().getInterfaces(),//目标对象的接口 本例为UserManager接口
					this//实现了InvocationHandler接口的对象
				);
	}
	//在静态代理类中的每个方法前都有一个额外的方法 ，在东态代理则在每个方法之前调用此方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkSecurity();
		//每个方法的返回值 本例中的UserManagerImpl中的add，delete，update，get
		//这些方法中有的有返回值 有的没有 因此次returnValue对象就是保证所有方法都适用
		Object returnValue=null;
		try{
		//参数1为目标对象UserManagerImpl，第二个参数每个方法的参数
			method.invoke(this.targetOjbect,args);//每个方法调用invoke就可完成代理
		}catch(Exception e){
			throw new RuntimeException();
		}
		return returnValue;//将返回值返回给目标对象
	}
	//需要额外添加的方法
	public void checkSecurity(){
		System.out.println("-----------checkSecurity--------------");
	}
}
