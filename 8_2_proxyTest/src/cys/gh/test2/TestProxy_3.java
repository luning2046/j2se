package cys.gh.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * ��TestProxy_2����һ�� �����Զ����ɵ��ֽ����ļ��Ķ���
 * ֻ�� ����ͨ�� Proxy����һ������ʵ�ֵ�
 */
public class TestProxy_3 {

	public static void main(String[] args) throws Exception {
		// �����������ʵ����������������ʵ�ֵ���ͬ���� ���Ƕ�̬����һ���� ��ʵ���������
		// ���Ǵ�����һ����̬������
		DDD d = (DDD) Proxy.newProxyInstance(DDD.class.getClassLoader(),// �������
				new Class[] { DDD.class },// ��̬���ɵ���Ҫʵ�ֵĽӿ�,��Ϊ����ʵ�ֶ���ӿ� ������������
				new InvocationHandler() {// ÿ��ʹ�����������Ķ���ķ���
											// �������InvocationHandler
					// ���е�invoke����

					DDDImpl di = new DDDImpl();

					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {

						Object retVal = method.invoke(di, args);

						return retVal;
					}
				});

		d.cc();
	}
}

interface DDD {
	public void cc();

	public void dd(int a, String b);
}

class DDDImpl implements DDD {

	@Override
	public void cc() {
		System.out.println("===============DDDImpl=====cc==========");
	}

	@Override
	public void dd(int a, String b) {
		System.out.println("===============DDDImpl=====dd==========");
	}

}
