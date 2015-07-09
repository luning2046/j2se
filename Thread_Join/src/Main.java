/**
 * 
 * @author Administrator
 * 本例的目标是：通过使用join方法后，使得main这个主线程
 * 等待t1,t2,t3执行结束之后才执行结束。
 * join方法必须在start方法之后才有效。
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
		
		t1.join();//这句话的意思是：t1所在的线程（也就是main线程）等待t1线程执行结束之后才继续执行
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