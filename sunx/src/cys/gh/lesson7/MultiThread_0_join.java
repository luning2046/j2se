package cys.gh.lesson7;


public class MultiThread_0_join {

	public static void main(String[] args) throws Exception{
		
		MyThread33 t1 = new MyThread33();
		MyThread33 t2 = new MyThread33();
		MyThread33 t3 = new MyThread33();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();//��仰����˼�ǣ�t1���ڵ��̣߳�Ҳ����main�̣߳��ȴ�t1�߳�ִ�н���֮��ż���ִ��
//		t2.join();
//		t3.join();
		
		System.out.println("==============="+Thread.currentThread().getName());
	}
}
class MyThread33 extends Thread{
	public void run(){
		for(int i=0;i<20;i++){
			try{
				Thread.sleep(200);
			}catch(Exception e){
				
			}
			System.out.println("==============="+Thread.currentThread().getName());
		}
	}
}
