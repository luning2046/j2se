package cys.gh.lesson6;

import java.lang.reflect.Method;

public class TestNewInstance2 {

	
	public static void main(String[] args) throws Exception {
		//�ȼ�����User
		Class clazz = Class.forName("cys.gh.lesson6.User");
		
		/*
		 * ��ȱʡ���޲ι��캯��������User�Ķ���,
		 * ��Object����ָ�����User����
		*/
		Object obj = clazz.newInstance();
		System.out.println(clazz.getName());
		//������������з���
		Method[] ms = clazz.getDeclaredMethods();
		//���������ִ�е�һ������ ����� ���ڶ��������Ǻ�������
		ms[0].invoke(obj,null);
	}
}
