package cys.gh.test1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * ��TestProxy_2����һ�� �����Զ����ɵ��ֽ����ļ��Ķ���
 * ֻ�� ����ͨ�� Proxy����һ������ʵ�ֵ�
 */
public class TestProxy_3 {

	public static void main(String[] args) throws Exception{
		//�����������ʵ����������������ʵ�ֵ���ͬ����  ���Ƕ�̬����һ����  ��ʵ���������
		DDD d = (DDD)Proxy.newProxyInstance(DDD.class.getClassLoader(),//�������
							   new Class[]{DDD.class},//��̬���ɵ���Ҫʵ�ֵĽӿ�,��Ϊ����ʵ�ֶ���ӿ� ������������
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

