package cys.gh.lesson7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketsSystem_5_2_lock {

	/**
	 * 与TicketsSystem_5_2功能一样
		只是使用5.0的concurrent中新的方式为临界资源加锁
	 */
	public static void main(String[] args) {
		SellThread_lock st = new SellThread_lock();
		new Thread(st,"新抚售票口").start();
		new Thread(st,"东洲售票口").start();
		new Thread(st,"望花售票口").start();
		new Thread(st,"新宾售票口").start();
	}

}

class SellThread_lock implements Runnable{
	private int tickets=100;
	
	Lock lock = new ReentrantLock();//创建一个锁
	
	public void run(){
		while(true){
				//给临界资源加锁
				lock.lock();//上锁
				try{
					if(tickets>0){
						System.out.println(Thread.currentThread().getName()+" ====卖出第"+tickets+"张票");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						tickets--;
					}
				}finally{
					lock.unlock();//解锁
				}
					
		}
	}
}