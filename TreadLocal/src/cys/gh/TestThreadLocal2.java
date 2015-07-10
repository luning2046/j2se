package cys.gh;
/*
 * 本例除了value的类型变为ThreadLocal类型之外，与TestThreadLocal1其他代码完全一致
 * 
 * 运行之后，对比两个例子的运行结果。就能看出ThreadLocal的作用了
 * http://blog.csdn.net/abing37/article/details/4460298
 */
public class TestThreadLocal2 {

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
		
		public  ThreadLocal<String> value = new ThreadLocal<String>();
		
		public  void put(String str){
			value.set(str);
			System.out.println("-------------------"+Thread.currentThread().getName()+"放入了值为\""+str+"\"的字符串");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===对应的值："+value.get());
			}
		}
	}
}




