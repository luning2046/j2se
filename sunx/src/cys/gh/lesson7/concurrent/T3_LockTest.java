package cys.gh.lesson7.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class T3_LockTest {

	/**
	 * Lock&Condition实现线程同步通信
	 * Lock比传统线程模型中的synchronized方式更加面向对象，与生活中的锁类似，锁本身也应该是一个对象。
	 * 两个线程执行的代码片段要实现同步互斥的效果，它们必须用同一个Lock对象
	 */
	public static void main(String[] args) {
		new T3_LockTest().init();
	}
	
	private void init(){
		final Outputer outputer = new Outputer();
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					outputer.output("zhangxiaoxiang");
				}
				
			}
		}).start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					outputer.output("lihuoming");
				}
				
			}
		}).start();
		
	}

	static class Outputer{
		Lock lock = new ReentrantLock();
		public void output(String name){
			int len = name.length();
			lock.lock();
			try{
				for(int i=0;i<len;i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();
			}finally{
				lock.unlock();
			}
		}
		
		public synchronized void output2(String name){
			int len = name.length();
			for(int i=0;i<len;i++){
					System.out.print(name.charAt(i));
			}
			System.out.println();
		}
		
		public static synchronized void output3(String name){
			int len = name.length();
			for(int i=0;i<len;i++){
					System.out.print(name.charAt(i));
			}
			System.out.println();
		}	
	}
}
