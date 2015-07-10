package cys.gh;

import java.util.HashMap;
import java.util.Map;

/*
 * ����TestThreadLocal2����һ�¡�
 * ������ʹ��Map����ʾ��ThreadLocal��ʵ��ԭ��
 */
public class TestThreadLocal3 {

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
		
		public  Map<Thread,String> value = new HashMap<Thread,String>();
		
		public  void put(String str){
			value.put(Thread.currentThread(),str);
			System.out.println("-------------------"+Thread.currentThread().getName()+"������ֵΪ\""+str+"\"���ַ���");
		}
		
		public  void show(){
			for(int i=0;i<10;i++){
				
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				
				System.out.println("========="+Thread.currentThread().getName()+"===��Ӧ��ֵ��"+value.get(Thread.currentThread()));
			}
		}
	}
}



