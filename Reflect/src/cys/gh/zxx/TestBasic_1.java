package cys.gh.zxx;

public class TestBasic_1 {

	/**
	 * Class������Ӧ��
	 * ֻҪ��Դ�����г��ֵ����ͣ����и��Ե�Classʵ�������� int[]��void
	 * 							�����Եõ���Ӧ���ֽ���  Class clz=void.class;
	 * 												Class clz=int[].class;
	 */
	public static void main(String[] args) throws Exception{
		
		String str = "abc";
		Class cls1 = str.getClass();//ͨ��������Class
		Class cls2 = String.class;//ͨ������Class
		Class cls3 = Class.forName("java.lang.String");//��"������"����һ���࣬��������������ֽ��븳��Class
		System.out.println(cls1==cls2);//true ��Ϊ����ָ��ͬһ��String��Class����
		System.out.println(cls1==cls3);//true ��Ϊ����ָ��ͬһ��String��Class����
		
		System.out.println(cls1.isPrimitive());//�ж��Ƿ������������ false
		System.out.println(int.class.isPrimitive());//�ǻ�����������true
		System.out.println(int.class == Integer.class);//falseһ���ǻ����������� һ���ǰ�װ����
		System.out.println(int.class==Integer.TYPE);//Integer.TYPE��ʾȡ�ð�װ���͵Ķ�Ӧ������������ ����true
		System.out.println(int[].class.isArray());//true �ж��Ƿ�����

	}
}
