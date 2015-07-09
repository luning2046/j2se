package cys.gh.lesson7;
/*
 * �� boolea���ͱ��� ��ֹһ���̵߳�ִ��
 * ����wait����ʱ  ����Boolean��Ǿ�ʧЧ��  Ҫ���interrupt������������ֹ�̵߳�ִ��
 */
public class V_StopThread_8_2 {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		mt.start();
		
		for(int i=0;i<10000;i++){
			if(i==5000){
				mt.stopThread();//��ֹ�̵߳�ִ��
				mt.interrupt();//ʹ�����������ֹ�̵߳�ִ��  ͬʱ���׳��쳣��һ���׳����쳣˵�� �߳���ʹ��wait����
								//���û�׳��쳣  ˵���߳���û��wait����  ������Ϊ����wait����ʱ ʹ������ͱ��
								//��ֹ�̵߳�ִ��
				break;
			}
			System.out.println("main  ����ִ��");
		}
	}
}

class MyThread2 extends Thread{
	
	private boolean bStop=true;//�����߳�ִ�еı��
	
	public synchronized void  run(){
		
		while(bStop){
			try {
				//��ͣ��ǰ�̵߳�ִ�У�����ȴ�����  ��ʱ��Ϊ�޷��ж�bStop���  ��˲���ʹ���߳̽���
				wait();
			} catch (InterruptedException e) {
				//e.printStackTrace();
				if(bStop)
					return;
			}
			
			System.out.println(getName()+" ����ִ�С�������");
		}
	}
	
	public void stopThread(){
		bStop=false;
	}
}
