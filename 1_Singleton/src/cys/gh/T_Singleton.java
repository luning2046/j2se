package cys.gh;

public class T_Singleton {

	public static void main(String[] args){
		//����Singleton���ص�ʱ�� �ʹ�����һ������  �ڳ���ִ���ڼ�
		//���۶������ã������������ʱ�������Ǹ�����
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1==s2);//true ��Ϊ�ǵ���ģʽ
		
	}
}
//��̬ģʽ��   ����ʽ
class Singleton{
	
	private Singleton(){}
	
	private final static Singleton s = new Singleton();
	
	public static Singleton getInstance(){
		return s;
	}
	
	public void say(){
		System.out.println("һ�������ĺ�����");
	}
}

//����ʽ  �ӳټ���
class Singleton2{
	
	private Singleton2(){}
	
	private  static Singleton2 s = null;
	
	public static Singleton2 getInstance(){
		
		synchronized (Singleton2.class) {
			if(s==null){
				s = new Singleton2();
			}
		}
		
		return s;
	}
	
	public void say(){
		System.out.println("һ�������ĺ�����");
	}
}