package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestFieldDemo_4_1 {

	public static void main(String[] args){
		String str = "ball";
		chanageStringValue(str);
	}
	//�޸��ַ�����ֵ
	private static void chanageStringValue(Object obj) {
		//������ݹ����Ĳ�����һ��String���ͣ�ͨ��obj.getClass()��ô���ܵõ�������String���͵�
		//�ֽ����أ������ݶ�̬ԭ����Ϊÿһ��ָ�������͵�getClass��������д�����getClass���������Ը���
		//���������д�˸���ķ��������ø��������������д�ķ���ʱ��ʵ���Ͼ��ǵ��õ���������������
		//���Ա�����ʵ���Ͼ͵õ��˴��ݹ������������͵�class����
		Class cls = obj.getClass();//������ݹ�������String���ͣ�ͨ�����͵õ���String��Class����
		System.out.println(cls);//class java.lang.String
		System.out.println(String.class);//class java.lang.String
	}
}
