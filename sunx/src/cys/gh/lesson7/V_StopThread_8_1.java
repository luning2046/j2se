package cys.gh.lesson7;
/*
 * �� boolea���ͱ��� ��ֹһ���̵߳�ִ��
 */
public class V_StopThread_8_1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<10000;i++){
			if(i==5000){
				mt.stopThread();//��ֹ�̵߳�ִ��
				break;
			}
			System.out.println("main  ����ִ��");
		}
	}
}

class MyThread extends Thread{
	
	private boolean bStop=true;//�����߳�ִ�еı��
	
	public void run(){
		while(bStop){
			System.out.println(getName()+" ����ִ�С�������");
		}
	}
	
	public void stopThread(){
		bStop=false;
	}
}
