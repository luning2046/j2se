package cys.gh.lesson6;
/*
 * ÿ��������ɵ�class�ֽ����ļ� ������һ��Class���� ����
 * ��ʾ������������Ϣ
 */
public class TestClass1 {

	public static void main(String[] args) throws Exception{
		User user = new User();
		Integer i = new Integer(4);
		/*
		 * Class����getName���� 
		 * �� String ����ʽ���ش� Class ��������ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ�
		 */
		
		//���ַ�ʽ��֪������������£�ָ��һ���ַ���������һ���ൽ�ڴ���
		Class clazz1 = Class.forName("cys.gh.sunxin.lesson6.User");
		System.out.println(clazz1.getName());//���ֵ��cys.gh.sunxin.lesson6.User
		System.out.println(clazz1);//���ֵ��class cys.gh.sunxin.lesson6.User
		
		
		//��������֪
		Class clazz2 = user.getClass();//ͨ��������Class����
		System.out.println(clazz2.getName());
		
		
		//������֪
		Class clazz3 = User.class;//ͨ���������Class����
		System.out.println(clazz3.getName());
		
		
		Class clazz4 = i.TYPE;//���ڻ����������͵ķ�װ�� ����ͨ��TYPE��� Class ����
		System.out.println(clazz4.getName());//���ص������ǻ����������� ���Ƿ�װ����
	
	}
}
