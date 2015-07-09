package cys.gh.lesson7;

public class MultiThread_1 {

	/**
	 * 简单的线程
	 * main函数就是一个默认的主线程
	 */
	public static void main(String[] args) {
		//currentThread()获得当前运行的线程引用（对象），getName（）获得这个对象的名称
		System.out.println(Thread.currentThread().getName());
		
		//可以通过Thread1 t1 = new Thread1("线程名");构造方法给线程指定一个名字
		//没有指定则由jvm默认指定一个名字 ，本例的这个线程名为  Thread_0
		Thread1 t1 = new Thread1();
		t1.start();
		//t1.start();此时抛出异常，一个线程只能开启一次
	}

}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
