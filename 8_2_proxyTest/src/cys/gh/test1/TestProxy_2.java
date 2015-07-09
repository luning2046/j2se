package cys.gh.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * �����Զ����ɵ��ֽ����ļ��Ķ���
 */
public class TestProxy_2 {

	public static void main(String[] args) throws Exception{
		
		Class clazz = Proxy.getProxyClass(EEE.class.getClassLoader(),EEE.class);
		
		Constructor[] cs = clazz.getConstructors();
		for(Constructor c : cs){
			//���췽����������  ͨ�����������Կ��������ֻ��һ�����췽��
			//��������췽���Ĳ���ֻ��һ��  ������java.lang.reflect.InvocationHandler
			//InvocationHandler��һ���ӿ�
			Class[] cps = c.getParameterTypes();
			System.out.print("���췽�����������У�");//������java.lang.reflect.InvocationHandler
			for(Class cp : cps){
				System.out.print(cp.getName()+",");
			}
			System.out.println();
		}
		
		
		//�����Ǵ��������Ķ���
		//��Ϊ InvocationHandler��һ���ӿ� ��������Ҫ����һ��ʵ������ӿڵ���  
		class MyInvocationHandler implements InvocationHandler{

			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return null;
			}
		}
		//����ָ���������͵õ�һ�����췽��
		Constructor c = clazz.getConstructor(MyInvocationHandler.class);
		//�õõ���������췽��ʵ����һ������
		EEE e = (EEE)c.newInstance(new MyInvocationHandler());
	}
}

interface EEE{
	public void cc();
	public void dd(int a,String b);
}

