package cys.gh.lesson5;

public class TestString {

	public static void main(String[] args) {
		
		test1();
	}

	private static void test1() {
		//�ַ���һ������ʼ�����Ͳ��ܸı䣨ָ�������´����еġ�aaa�����ܸı䣬�������ñ���s��s���Ըı䣩����
		String s = "aaa";//aaa�洢���ַ����������С�
		String s1 = "aaa";
		System.out.println(s==s1);//ֵtrue����Ϊjvm����һ���ַ���ʱ�������ַ����洢���ַ�����������
								//���ڴδ���һ�����ַ���ʱ���������ַ����������в�����û��������ַ���equals���ַ�������
								//�У���ֱ��ָ��˳������ü���
	}
	private static void test2() {
		String s = "aaa";
		String s1 = new String("aaa");
		System.out.println(s==s1);//ֵfalse����Ϊsָ����ַ����Ǵ洢���ַ�����������
										//s1ָ��Ķ����ڶ��ڴ��д����Ķ������ʼֵΪaaa
	}
}
