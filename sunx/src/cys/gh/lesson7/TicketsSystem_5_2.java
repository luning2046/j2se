package cys.gh.lesson7;

public class TicketsSystem_5_2 {

	/**
	 * ������̵߳���ʱ�������  ��Ҳ���̰߳�ȫ���⣩
	 * ���߳�ͬ���ķ�ʽ �����Ǹ��ٽ���Դ��������Ϊ���ַ�ʽ
	 * 			1ͬ����  2ͬ������
	 * ���� 1ͬ����
	 * ���ʹ�����Դ�Ĵ������С��ٽ���Դ��   ������titckets�ǹ�����Դ  if���ξ����ٽ���Դ
	 * 
	 * ��Ϊ���̰߳�ȫ���⣬���ԲŻ�����ͬ�����ơ�
	     ֻҪ����̷߳���ͬһ��������顱����ν����飺���Ƕ��������ɵ����飩�Ϳ��ܲ����̰߳�ȫ���⣬��Ϊһ���߳̽������������
	     ����ĳ��ԭ����ͣ�ڴ�����У���ʱ��һ���߳̽����������飬��������¾Ϳ��ܲ������⡣����취����  ������������ס��
	     ֻ��һ���߳�ִ������������󣬲����������߳̽��롣

	 */
	public static void main(String[] args) {
		SellThread1 st = new SellThread1();
		new Thread(st,"�¸���Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"�±���Ʊ��").start();
	}

}

class SellThread1 implements Runnable{
	private int tickets=100;
	//ÿһ��������һ�������� ���߽���      
	//��ͬ�Ķ����ǲ�ͬ����    Ҫʵ���̼߳��ͬ�� ��ô�ͱ��빲��ͬһ������ͬһ������
	Object obj = new Object();
	
	public void run(){
		while(true){
				//���ٽ���Դ����
				synchronized (obj) {
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
	}
}