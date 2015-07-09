package cys.gh.lesson7;

import java.io.File;

public class V_DeadLock_6 {

	/**
	 * 死锁
	 */
	public static void main(String[] args) {
		
		SellThread4 st = new SellThread4();
		
		new Thread(st,"线程1").start();
		
		try {
			Thread.sleep(21);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.flag=false;
		
		new Thread(st,"线程2").start();
	}

}

class SellThread4 implements Runnable{
	
	boolean flag=true;//让线程运行标记
	
	//锁可以是任何对象  如下面的 obj和f
	Object obj = new Object();
	File f = new File("");
	
	public void run(){
		if(flag){
			synchronized(obj){
				System.out.println("线程1先执行。。。。");	
				try {
					//线程1睡眠
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(f){
					System.out.println("线程1继续执行。。。。");
				}
			}
		}else{
			synchronized(f){
				System.out.println("线程2先执行。。。。");	
				synchronized(obj){
					System.out.println("线程2继续执行。。。。");
				}
			}
		}
	}
}


