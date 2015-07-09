package cys.gh.lesson7;


public class MultiThread_0_join {

	public static void main(String[] args) throws Exception{
		
		MyThread33 t1 = new MyThread33();
		MyThread33 t2 = new MyThread33();
		MyThread33 t3 = new MyThread33();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();//这句话的意思是：t1所在的线程（也就是main线程）等待t1线程执行结束之后才继续执行
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
