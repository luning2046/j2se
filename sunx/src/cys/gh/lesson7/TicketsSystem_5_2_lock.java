package cys.gh.lesson7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketsSystem_5_2_lock {

	/**
	 * ��TicketsSystem_5_2����һ��
		ֻ��ʹ��5.0��concurrent���µķ�ʽΪ�ٽ���Դ����
	 */
	public static void main(String[] args) {
		SellThread_lock st = new SellThread_lock();
		new Thread(st,"�¸���Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"�±���Ʊ��").start();
	}

}

class SellThread_lock implements Runnable{
	private int tickets=100;
	
	Lock lock = new ReentrantLock();//����һ����
	
	public void run(){
		while(true){
				//���ٽ���Դ����
				lock.lock();//����
				try{
					if(tickets>0){
						System.out.println(Thread.currentThread().getName()+" ====������"+tickets+"��Ʊ");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						tickets--;
					}
				}finally{
					lock.unlock();//����
				}
					
		}
	}
}