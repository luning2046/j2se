/**
 * 
 * @author Administrator
 * ������Ŀ���ǣ�ͨ��ʹ��join������ʹ��main������߳�
 * �ȴ�t1,t2,t3ִ�н���֮���ִ�н�����
 * join����������start����֮�����Ч��
 * 
 */
public class Main {

	public static void main(String[] args) throws Exception{
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();//��仰����˼�ǣ�t1���ڵ��̣߳�Ҳ����main�̣߳��ȴ�t1�߳�ִ�н���֮��ż���ִ��
		t2.join();
		t3.join();
		
		System.out.println("==============="+Thread.currentThread().getName());
	}
}

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("==============="+Thread.currentThread().getName());
		}
	}
}