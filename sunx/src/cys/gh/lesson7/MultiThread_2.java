package cys.gh.lesson7;

public class MultiThread_2 {

	/**
	 * ��̨�̣߳��ڶ���̲߳������е�����£���һ���߳�a
	 * 			��ǰ�����̶߳�ִ�н����󣬼�ʹ����߳�aû��ִ�н�����Ҳ�Զ���ִֹ�С���ô�������
	 * 				�߳�a���Ե��߳� �ͽ�---
	 */
	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		
		t2.setDaemon(true);//ͨ������������߳�����Ϊ����̨�̡߳����������߳�ִ��֮ǰ����
		t2.start();
		
		//��main�������ڵ��߳����н���֮�󣨼�ѭ��10000�Σ�
		//t2���"��̨�߳�"Ҳ�Զ���ֹ����
		int i=0;
		while(i++<50){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

}
class Thread2 extends Thread{

	@Override
	public void run() {
		
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//�����൱��Thread.currentThread().getName(),
			//��Ϊ�̳���Thread������ʡ����Thread.currentThread.
			System.out.println(getName());	
			
		}
	}
	
}