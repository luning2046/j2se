package cys.gh.lesson7;

public class MultiThread_2 {

	/**
	 * 后台线程：在多个线程并发运行的情况下，有一个线程a
	 * 			当前其他线程都执行结束后，即使这个线程a没有执行结束，也自动终止执行。那么这个具有
	 * 				线程a特性的线程 就叫---
	 */
	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		
		t2.setDaemon(true);//通过这个方法将线程设置为“后台线程”。必须在线程执行之前设置
		t2.start();
		
		//当main函数所在的线程运行结束之后（即循环10000次）
		//t2这个"后台线程"也自动终止运行
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
			//本句相当于Thread.currentThread().getName(),
			//因为继承了Thread的所以省略了Thread.currentThread.
			System.out.println(getName());	
			
		}
	}
	
}
