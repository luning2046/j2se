package cys.gh.lesson7;

public class MultiThread_4_2 {

	/**
	 * ���ڲ���ʵ��MultiThread_4_1�Ĺ����Ա����������
	 */
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.getInner("�߳�1").start();
		tt.getInner("�߳�2").start();
		tt.getInner("�߳�3").start();
	}
}
class TestThread {
	
	private int count=0;//�������
	
	//�ڲ���
	class InnerThread extends Thread{
		
		//������췽������Ϊ�˸�һ���߳��ṩһ������
		public InnerThread(String threadName){
			super(threadName);
		}
			
		public void run(){
			while(true)
				System.out.println(Thread.currentThread().getName()+"-----count= "+count++);
		}
	}
	
	//����һ��ָ���߳������̶߳���
	public InnerThread getInner(String threadName){
		return new InnerThread(threadName);
	}
}
