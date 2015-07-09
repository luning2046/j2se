package cys.gh.lesson7;

public class TicketsSystem_5_3 {

	/**
	 * ������̵߳���ʱ�������  
	 * ���߳�ͬ���ķ�ʽ �����Ǹ��ٽ���Դ��������Ϊ���ַ�ʽ
	 * 			1ͬ����  2ͬ������
	 * ����  2ͬ������
	 * ���ʹ�����Դ�Ĵ������С��ٽ���Դ��   ������titckets�ǹ�����Դ  if���ξ����ٽ���Դ
	 */
	public static void main(String[] args) {
		SellThread3 st = new SellThread3();
		new Thread(st,"�¸���Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"�±���Ʊ��").start();
	}

}

class SellThread3 implements Runnable{
	private int tickets=100;
	public void run(){
		
		while(true){
			//ʹ��ͬ������
			sell();
		}
	}
	/*
	 *   ͬ������  ԭ��Ҳ��ִ�е�������ʱ��һ���������   ��������this 
      	   �൱��	synchronized(this){
      	   			sell();
				}  
	 */
	public synchronized void sell(){
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+" ====������"+tickets+"��Ʊ");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tickets--;
		}
	}
}