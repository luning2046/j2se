package cys.gh.lesson7;
/*
 * 用 boolea类型变量 终止一个线程的执行
 */
public class V_StopThread_8_1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<10000;i++){
			if(i==5000){
				mt.stopThread();//终止线程的执行
				break;
			}
			System.out.println("main  正在执行");
		}
	}
}

class MyThread extends Thread{
	
	private boolean bStop=true;//控制线程执行的标记
	
	public void run(){
		while(bStop){
			System.out.println(getName()+" 正在执行。。。。");
		}
	}
	
	public void stopThread(){
		bStop=false;
	}
}
