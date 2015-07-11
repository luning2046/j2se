package cys.gh.lesson7.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class T03_LockTest {

	/**
	 * Lock&Condition实现线程同步通信
	 * Lock比传统线程模型中的synchronized方式更加面向对象，与生活中的锁类似，锁本身也应该是一个对象。
	 * 两个线程执行的代码片段要实现同步互斥的效果，它们必须用同一个Lock对象
	 */
	public static void main(String[] args) {
		new T03_LockTest().init();
	}
	
	private void init(){
		final Outputer outputer = new Outputer();
		new Thread(new Runnable(){//第一个线程
			@Override
			public void run() {
				while(true){
					try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
					outputer.output("zhangxiaoxiang");
				}
			}
		}).start();
		
		new Thread(new Runnable(){//第二个线程
			@Override
			public void run() {
				while(true){
					try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
					outputer.output("lihuoming");
				}
			}
		}).start();
	}

	static class Outputer{
		Lock lock = new ReentrantLock();
		
		public void output(String name){
			int len = name.length();
			lock.lock();//加锁
			try{
				for(int i=0;i<len;i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();
			}finally{
				lock.unlock();//解锁      lock要求加锁后  一定要解锁
			}
		}
	}
}
