package cys.gh.lesson7;

public class TicketsSystem_5_4 {

	/**
	  多个线程只要访问  同一把锁对应的方法，那么这些线程都是同步的 ，不会产生线程安全问题
	 */
	public static void main(String[] args) {
		final Resource r = new Resource();
		new Thread(new Runnable() {
			@Override
			public void run() {
				r.sell_1();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				r.sell_1();
			}
		}).start();
	}

}

/**
 * 这个对象有两个不同sychronized方法，但是他俩共享同一把锁  也就是  “this”这把锁
 *  因此就算  两个线程分别访问这两个方法，仍然是互斥，不会产生 线程安全的问题
 */
class Resource{
	private int tickets=100;
	
	public synchronized void sell_1(){//是this锁
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+" ====卖出第"+tickets+"张票");
			tickets--;
		}
	}
	
	public synchronized void sell_2(){//是this锁
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+" ====卖出第"+tickets+"张票");
			tickets--;
		}
	}
	
	public synchronized static void method(){//静态方法对应的锁是  Resource.class（这是一个Class对象）
		
	}
	
	
}