package cys.gh.zxx;

import java.lang.reflect.Constructor;

/*
 * �����Ϊ����ʱ���������ʱ����
 */
public class TestConstructor_2 {

	public static void main(String[] args) throws Exception {

		Class cls = String.class;
		//String s = (String)cls.newInstance();//���޲ι��췽����������
		
		//�õ�ָ�������Ĺ��캯��,��ΪString���кö๹�췽������ô���ܵõ�һ��
		//ָ���Ĺ��췽���أ��������������getConstructor()��ָ�����캯���Ĳ����������������������ͣ�
		//�����о��ǵõ� String��StringBuffer sb�����췽��
		Constructor constructor = cls.getConstructor(StringBuffer.class);
		
		//�ù��췽������һ������
		String str1 = (String)constructor.newInstance(new StringBuffer("cys"));
		//���ù��췽������һ������
		String str2 = (String)constructor.newInstance(new StringBuffer("cys"));
		System.out.println(str1.toString());
	}
}
