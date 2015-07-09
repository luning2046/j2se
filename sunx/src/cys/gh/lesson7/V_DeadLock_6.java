package cys.gh.lesson7;

import java.io.File;

public class V_DeadLock_6 {

	/**
	 * ����
	 */
	public static void main(String[] args) {
		
		SellThread4 st = new SellThread4();
		
		new Thread(st,"�߳�1").start();
		
		try {
			Thread.sleep(21);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		st.flag=false;
		
		new Thread(st,"�߳�2").start();
	}

}

class SellThread4 implements Runnable{
	
	boolean flag=true;//���߳����б��
	
	//���������κζ���  ������� obj��f
	Object obj = new Object();
	File f = new File("");
	
	public void run(){
		if(flag){
			synchronized(obj){
				System.out.println("�߳�1��ִ�С�������");	
				try {
					//�߳�1˯��
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(f){
					System.out.println("�߳�1����ִ�С�������");
				}
			}
		}else{
			synchronized(f){
				System.out.println("�߳�2��ִ�С�������");	
				synchronized(obj){
					System.out.println("�߳�2����ִ�С�������");
				}
			}
		}
	}
}


