package cys.gh;
/*
	没使用TheadLoacl的代码
 */
public class TestThreadLocal1 {

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
	
	private static class ShareThreadLocal{
		
		public  String value;
		
		public  void put(String str){
			value = str;
			System.out.println("-------------------"+Thread.currentThread().getName()+"放入了值为\""+value+"\"的字符串");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===对应的值："+value);
			}
		}
	}
}




