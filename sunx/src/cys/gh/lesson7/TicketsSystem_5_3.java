package cys.gh.lesson7;

public class TicketsSystem_5_3 {

	/**
	 * 解决多线程的与时间的问题  
	 * 用线程同步的方式 ：就是给临界资源加锁，分为两种方式
	 * 			1同步块  2同步方法
	 * 本例  2同步方法
	 * 访问共享资源的代码区叫“临界资源”   本例中titckets是共享资源  if语句段就是临界资源
	 */
	public static void main(String[] args) {
		SellThread3 st = new SellThread3();
		new Thread(st,"新抚售票口").start();
		new Thread(st,"东洲售票口").start();
		new Thread(st,"望花售票口").start();
		new Thread(st,"新宾售票口").start();
	}

}

class SellThread3 implements Runnable{
	private int tickets=100;
	public void run(){
		
		while(true){
			//使用同步方法
			sell();
		}
	}
	/*
	 *   同步方法  原理也是执行到个方法时给一个对象加锁   这个对象就this 
      	   相当于	synchronized(this){
      	   			sell();
				}  
	 */
	public synchronized void sell(){
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