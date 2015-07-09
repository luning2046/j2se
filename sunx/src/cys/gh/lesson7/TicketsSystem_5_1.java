package cys.gh.lesson7;

public class TicketsSystem_5_1 {

	/**
	 * 多线程的与时间的问题
	 */
	public static void main(String[] args) {
		SellThread st = new SellThread();
		new Thread(st,"新抚售票口").start();
		new Thread(st,"东洲售票口").start();
		new Thread(st,"望花售票口").start();
		new Thread(st,"新宾售票口").start();
	}
}

class SellThread implements Runnable{
	private int tickets=100;
	
	public void run(){
		
		while(true){
				if(tickets>0){
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" ====卖出第"+(tickets--)+"张票");
//					tickets--;
				}
		}
	}
}