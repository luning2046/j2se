package cys.gh.zxx;

import java.lang.reflect.Method;

public class TestMethod_5 {

	public static void main(String[] args)throws Exception{
		String str = "cysgh";
		Class cls = str.getClass();
		//�õ�ָ���ĺ��� ��һ�������� ������  �ڶ��������� �����Ĳ�������
		Method m = cls.getMethod("charAt",int.class);
		//���÷���ʱ��Ҫָ��ĳ������ͷ��������������static���������ֵnull
		System.out.println(m.invoke(str,3));
		
	}
}
