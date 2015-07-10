package cys.gh.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * ����proxy�Ĺ���:���Ƕ�̬���������ڴ���һ���ֽ���
 */
public class TestProxy_1 {

	public static void main(String[] args){
		//getProxyClass�����̬���� ���Ƕ�̬���������ڴ���һ���ֽ���
		//���������   ����1�� ָ��һ���������   һ������������  �Ǻ�����ӿڵ��������һ����
		//				ΪʲôҪ�ṩһ����������أ���Ϊ�κ�һ���඼Ҫ��һ���������  ��̬���ɵ������Ҳ������ 
		//			 ����2�Ǹ�Ҫ���ɵ��ֽ�������ṩһ���ӿڣ���Ȼ���ɵ������  ��ȻҲ��ʵ���˽ӿ�aaa����
		Class clazz = Proxy.getProxyClass(aaa.class.getClassLoader(),aaa.class);
		System.out.println("��̬���ɵ������������ǣ�"+clazz.getName());
		
		System.out.println("============================���췽��===================================");
		//�鿴�����̬���ɵ���Ĺ��췽��
		Constructor[] cs = clazz.getConstructors();
		for(Constructor c : cs){
			System.out.println("���췽����"+c.getName());//���췽����  ���������Կ��������ֻ��һ�������Ĺ��췽��
			
			//���췽����������
			Class[] cps = c.getParameterTypes();
			System.out.print("���췽�����������У�");//������java.lang.reflect.InvocationHandler
			for(Class cp : cps){
				System.out.print(cp.getName()+",");
			}
			System.out.println();
		}
		System.out.println("=============================����==================================");
		//�鿴�����̬���ɵ����һ�㷽��
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m : ms){
			System.out.println("������"+m.getName());//������
			
			//������������
			Class[] mps = m.getParameterTypes();
			System.out.print("�������������У�");
			for(Class mp : mps){
				System.out.print(mp.getName()+",");
			}
			System.out.println();
			
			//�����ķ���ֵ
			Class rt = m.getReturnType();
			System.out.println("�����ķ���ֵ"+rt.getName());
		}
	}
}

interface aaa{
	public void cc();
	public void dd(int a,String b);
}

