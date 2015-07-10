package cys.gh;
/*
 * ��������value�����ͱ�ΪThreadLocal����֮�⣬��TestThreadLocal1����������ȫһ��
 * 
 * ����֮�󣬶Ա��������ӵ����н�������ܿ���ThreadLocal��������
 * http://blog.csdn.net/abing37/article/details/4460298
 */
public class TestThreadLocal2 {

	public static void main(String[] args){
		
		final ShareThreadLocal stl = new ShareThreadLocal();
		
		//��һ���߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				stl.put("cys");
				stl.show();
			}
		}).start();
		
		//�ڶ����߳�
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
			System.out.println("-------------------"+Thread.currentThread().getName()+"������ֵΪ\""+str+"\"���ַ���");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===��Ӧ��ֵ��"+value.get());
			}
		}
	}
}




