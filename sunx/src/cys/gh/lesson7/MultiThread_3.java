package cys.gh.lesson7;

public class MultiThread_3 {

	/**
	 * ���������̵߳����ȼ�  t2.setPriority(Thread.MAX_PRIORITY)
	 */
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.start();
	}

}
class Thread3 extends Thread{

	@Override
	public void run() {
		
		while(true){
			System.out.println(getName());	
			//�ڶ���̲߳���ִ�е��������������ñ��߳� ����ִ��
			//��ʱ��Ƭ �ø�����߳�ִ��
			Thread.yield();
		}
	}
	
}
