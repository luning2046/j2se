package cys.gh;

public class Test1 {

	/*
	 * �����õ�AppClassLoader�������
	 */
	public static void main(String[] args){
		//�õ�Test����������  �������Ҳ��һ����
		ClassLoader cl = Test1.class.getClassLoader();
		System.out.println(cl.getClass().getName());//�õ�����������������
	}
}
