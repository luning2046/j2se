package cys.gh;

public class Test2 {

	/*
	 * java�����Ĭ�ϵ� ��������У�
	 *  	BootStrap		        ����JRE/LIB/rt.jar   ������������ռ�������  ����һ��java�� �������
	 *  	ExtClassLoader	        ����JRE/lib/ext/*.jar	
	 *  	AppClassLoader     ����ClassPathָ��������jar��Ŀ¼
	 *  ��Щ��������� ��״�ṹ�Ĺ�ϵ
	 *  
	 */
	public static void main(String[] args){
		//�õ�Test����������  �������Ҳ��һ����
		ClassLoader cl = Test2.class.getClassLoader();
		while(cl!=null){
			System.out.println(cl.getClass().getName());//�õ�����������������
			cl = cl.getParent();
		}
		System.out.println(cl);
	}
}
