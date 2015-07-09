package cys.gh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {

	/**
	 * ���Է���
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
		/*1.�÷��� ����Person�࣬�õ���Class����clazz��
		 * 	����ʱ��ִ�б����صľ�̬�����
			�Ծ�̬�������г�ʼ��
		*/
		Class clazz = Class.forName("cys.gh.Person");
		System.out.println("----------------------------------------------------");
		/*
		 * 2.��clazz���Դ�������������newInstance������������������Ҫ�󱻼��ص�����һ��
				�޲���������
		 */
		Object o = clazz.newInstance();//��ʱoָ��һ��Person��Ķ���
		Person p = (Person)o;
		p.setAddress("fushun");//��ʱ�Ϳ��Բ���Person������
		System.out.println(p.getAddress());
		System.out.println("----------------------------------------------------");
		/*
		 * 3.����Class����clazz�Ϳ��Եõ�����Person�����з���
		 * Method����java.lang.reflech���µ���
		 * Method �ṩ�������ӿ��ϵ���ĳ���������Լ���η��ʸ÷���������Ϣ��
		 * 						����ӳ�ķ����������෽����ʵ���������������󷽷�����
		 * getMethods()�õ����з�private�����з������������������еķ���
		 * getDeclareMethods�����õ����з�������private�������ܵĵ��������еķ��� 
		 */
		Method[] methods = clazz.getMethods();
		for(Method method:methods){
			System.out.println("Person��ķ�������"+method.getName());//�������̳����ķ���
		}
		System.out.println("----------------------------------------------------");
		/*
		 * 4.����Class����clazz�Ϳ��Եõ�����Person�����з��������г�Ա����
		 */
		//Field[] fields = clazz.getFields();��ȡ��˽�еĳ�Ա����
		Field[] fields = clazz.getDeclaredFields();//��ȡ���еĳ�Ա����
		for(Field field:fields){
			System.out.println("Person��ĳ�Ա��������"+field.getName());//�������̳����ĳ�Ա����
		}
		System.out.println("----------------------------------------------------");
		
		/*
		 * 5.����Class����clazz�Ϳ��Եõ�����Person�����еĹ��췽��
		 * Constructor con = clazz.getConstructor(String.class);�õ�ָ�������Ĺ��췽��
		 * Object o = con.newInstance("cys");��ָ���Ĺ��췽������һ��ʵ��
		 */
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor:constructors){
			System.out.println("Person��Ĺ��췽����"+constructor.getName());//�������̳����Ĺ��췽��
		}
		System.out.println("----------------------------------------------------");
		/*
		 * 6.����Class����clazz�Ϳ��Եõ�����Person�ĸ���
		 */
		Class superClazz = clazz.getSuperclass();
		System.out.println("Person�ĸ���"+superClazz.getName());
		System.out.println("----------------------------------------------------");

		/*
		 * 7.��ȡ��ǰ��ʵ�ֵĽӿ�
		 */
		Class[] interfaceClazzs = clazz.getInterfaces();
		for(Class interfaceclazz:interfaceClazzs){
			System.out.println(interfaceclazz.getName());
		}
		System.out.println("----------------------------------------------------");

		/*
		 * 8.��ȡ�������÷���ִ��
		 */
		Method method = clazz.getMethod("test", null);//��һ�������Ƿ��������ڶ��������Ƿ����Ĳ�������
		method.invoke(o,null);//��һ�������Ƕ��������ڶ��������Ƿ����Ĳ���ֵ
	}

}



















