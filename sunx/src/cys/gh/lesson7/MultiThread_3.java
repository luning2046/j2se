package cys.gh.lesson7;

public class MultiThread_3 {

	/**
	 * 可以设置线程的优先级  t2.setPriority(Thread.MAX_PRIORITY)
	 */
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.start();
	}

}
class Thread3 extends Thread{

	@Override
	public void run() {
		
		while(true){
			System.out.println(getName());	
			//在多个线程并发执行的情况下这个方法让本线程 放弃执行
			//把时间片 让给别的线程执行
			Thread.yield();
		}
	}
	
}
