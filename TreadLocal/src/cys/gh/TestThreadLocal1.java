package cys.gh;
/*
	ûʹ��TheadLoacl�Ĵ���
 */
public class TestThreadLocal1 {

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
	
	private static class ShareThreadLocal{
		
		public  String value;
		
		public  void put(String str){
			value = str;
			System.out.println("-------------------"+Thread.currentThread().getName()+"������ֵΪ\""+value+"\"���ַ���");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===��Ӧ��ֵ��"+value);
			}
		}
	}
}




