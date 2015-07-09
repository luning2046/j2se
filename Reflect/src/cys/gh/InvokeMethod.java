package cys.gh;

import java.lang.reflect.Method;

public class InvokeMethod {

	/**
	 * ���ò�ִ��һ������
	 */
	public static void main(String[] args) {
		invokeMethod(new User(2,"gh"));
	}
	
	public static void invokeMethod(Object obj){
		/**
		 * ��Ϊÿ���ࣨ��User)����д��Object�е�getClass����
		 * ���ݶ�̬��ԭ������ִ���������getClass��������User��
		 */
		Method[] ms = obj.getClass().getDeclaredMethods();
		for(Method m : ms){
			System.out.println(m.getName());
			//m.invoke(arg0, arg1)
		}
	}
}
