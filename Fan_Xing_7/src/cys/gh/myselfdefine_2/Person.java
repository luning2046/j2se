package cys.gh.myselfdefine_2;
/*
 * ������T��ʾ�ɱ���������� �������ʱ��ָ��T��ʲô���������
 * �Զ���ķ�����
 */
public class Person<T>{
	private final int id;
	private T secrecy;
	
	public Person(int id){
		this.id=id;
	}
	public void setSecrecy(T t){
		secrecy=t;
	}
	public T getSecrecy(){
		return secrecy;
	}
	
	/**
	 * �����Ͷ����ڷ�����
	 */
	public <W> void show(W w){
		
	}
	/**
	 *��������̬ʱ�����ܷ������϶���ķ��͡����
	 *��̬�������÷��ͣ�ֻ�ܽ����Ͷ����ڷ�����
	 */
//	public static void method(T t){
//		
//	}
	public  static <Y> void method(Y y){
		
	}
	
	
}
