package cys.gh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object targetOjbect;//������Ķ���(Ŀ�����) ������ʽUserManagerImpl��
	
	public Object newProxy(Object targetObject){
		
		this.targetOjbect = targetObject;
		//���������� ��Ҫ��������
		return Proxy.newProxyInstance(
					targetObject.getClass().getClassLoader(),//Ŀ������������� ����ΪUserManagerImpl��ļ�����
					targetObject.getClass().getInterfaces(),//Ŀ�����Ľӿ� ����ΪUserManager�ӿ�
					this//ʵ����InvocationHandler�ӿڵĶ���
				);
	}
	//�ھ�̬�������е�ÿ������ǰ����һ������ķ��� ���ڶ�̬��������ÿ������֮ǰ���ô˷���
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkSecurity();
		//ÿ�������ķ���ֵ �����е�UserManagerImpl�е�add��delete��update��get
		//��Щ�������е��з���ֵ �е�û�� ��˴�returnValue������Ǳ�֤���з���������
		Object returnValue=null;
		try{
		//����1ΪĿ�����UserManagerImpl���ڶ�������ÿ�������Ĳ���
			method.invoke(this.targetOjbect,args);//ÿ����������invoke�Ϳ���ɴ���
		}catch(Exception e){
			throw new RuntimeException();
		}
		return returnValue;//������ֵ���ظ�Ŀ�����
	}
	//��Ҫ������ӵķ���
	public void checkSecurity(){
		System.out.println("-----------checkSecurity--------------");
	}
}
