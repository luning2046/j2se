package cys.gh.lesson7;
/*
 * 用 boolea类型变量 终止一个线程的执行
 * 当有wait存在时  光用Boolean标记就失效了  要结合interrupt（）方法来终止线程的执行
 */
public class V_StopThread_8_2 {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		mt.start();
		
		for(int i=0;i<10000;i++){
			if(i==5000){
				mt.stopThread();//终止线程的执行
				mt.interrupt();//使用这个方法终止线程的执行  同时会抛出异常，一旦抛出了异常说明 线程中使用wait方法
								//如果没抛出异常  说明线程中没有wait方法  这句就是为了有wait方法时 使用它结和标记
								//终止线程的执行
				break;
			}
			System.out.println("main  正在执行");
		}
	}
}

class MyThread2 extends Thread{
	
	private boolean bStop=true;//控制线程执行的标记
	
	public synchronized void  run(){
		
		while(bStop){
			try {
				//暂停当前线程的执行，进入等待队列  此时因为无发判断bStop标记  因此不能使此线程结束
				wait();
			} catch (InterruptedException e) {
				//e.printStackTrace();
				if(bStop)
					return;
			}
			
			System.out.println(getName()+" 正在执行。。。。");
		}
	}
	
	public void stopThread(){
		bStop=false;
	}
}
