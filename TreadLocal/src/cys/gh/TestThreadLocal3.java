package cys.gh;

import java.util.HashMap;
import java.util.Map;

/*
 * 本例TestThreadLocal2功能一致。
 * 本例是使用Map简单演示了ThreadLocal的实现原理
 */
public class TestThreadLocal3 {

	public static void main(String[] args){
		
		final ShareThreadLocal stl = new ShareThreadLocal();
		
		//第一个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				stl.put("cys");
				stl.show();
			}
		}).start();
		
		//第二个线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				stl.put("gh");
				stl.show();
			}
		}).start();
		
	}
	
	private static  class ShareThreadLocal{
		
		public  Map<Thread,String> value = new HashMap<Thread,String>();
		
		public  void put(String str){
			value.put(Thread.currentThread(),str);
			System.out.println("-------------------"+Thread.currentThread().getName()+"放入了值为\""+str+"\"的字符串");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===对应的值："+value.get(Thread.currentThread()));
			}
		}
	}
}




