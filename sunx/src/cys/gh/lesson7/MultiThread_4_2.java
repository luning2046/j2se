package cys.gh.lesson7;

public class MultiThread_4_2 {

	/**
	 * 用内部类实现MultiThread_4_1的共享成员变量的例子
	 */
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.getInner("线程1").start();
		tt.getInner("线程2").start();
		tt.getInner("线程3").start();
	}
}
class TestThread {
	
	private int count=0;//共享变量
	
	//内部类
	class InnerThread extends Thread{
		
		//这个构造方法就是为了给一个线程提供一个名字
		public InnerThread(String threadName){
			super(threadName);
		}
			
		public void run(){
			while(true)
				System.out.println(Thread.currentThread().getName()+"-----count= "+count++);
		}
	}
	
	//返回一个指定线程名的线程对象
	public InnerThread getInner(String threadName){
		return new InnerThread(threadName);
	}
}
