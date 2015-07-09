package cys.gh.lesson7;

public class TicketsSystem_5_2 {

	/**
	 * 解决多线程的与时间的问题  （也叫线程安全问题）
	 * 用线程同步的方式 ：就是给临界资源加锁，分为两种方式
	 * 			1同步块  2同步方法
	 * 本例 1同步块
	 * 访问共享资源的代码区叫“临界资源”   本例中titckets是共享资源  if语句段就是临界资源
	 * 
	 * 因为有线程安全问题，所以才会引入同步机制。
	     只要多个线程访问同一个“代码块”（所谓代码块：就是多条语句组成的语句块）就可能产生线程安全问题，因为一个线程进入这个代码块后，
	     由于某种原因暂停在代码块中，此时另一个线程进入这个代码块，这种情况下就可能产生问题。解决办法就是  将这个代码块锁住，
	     只有一个线程执行完这个代码块后，才允许其他线程进入。

	 */
	public static void main(String[] args) {
		SellThread1 st = new SellThread1();
		new Thread(st,"新抚售票口").start();
		new Thread(st,"东洲售票口").start();
		new Thread(st,"望花售票口").start();
		new Thread(st,"新宾售票口").start();
	}

}

class SellThread1 implements Runnable{
	private int tickets=100;
	//每一个对象都有一个监视器 或者叫锁      
	//不同的对象是不同的锁    要实现线程间的同步 那么就必须共享同一把锁即同一个对象
	Object obj = new Object();
	
	public void run(){
		while(true){
				//给临界资源加锁
				synchronized (obj) {
					if(tickets>0){
						System.out.println(Thread.currentThread().getName()+" ====卖出第"+tickets+"张票");
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