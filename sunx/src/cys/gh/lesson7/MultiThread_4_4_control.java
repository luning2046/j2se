package cys.gh.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 本例是  主线程控制  多个线程顺序执行 
 * @author Administrator
 *
 */
public class MultiThread_4_4_control {

	List<ThreadTest2> list = new ArrayList<ThreadTest2>();
	boolean alldeads = true; 
	int i=0;
	
	public static void main(String[] args) {
		new MultiThread_4_4_control().createTaskList();
	}
	public void createTaskList(){
		ThreadTest2 t1 = new ThreadTest2();
		ThreadTest2 t2 = new ThreadTest2();
		ThreadTest2 t3 = new ThreadTest2();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		
		Timer timer = new Timer();
		timer.schedule(new ControlTask(),0,500);
		
	}
	class ControlTask extends TimerTask{
		public void run(){
			for(ThreadTest2 tt : list){
				alldeads = (tt.isAlive()? false:true);
			}
			if(alldeads){
				if(i<list.size())
					list.get(i).start();
				i++;
			}
		}
	}
}

class ThreadTest2 extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(300);
			}catch(Exception e){}
			System.out.println("====================="+getName());
		}
	}
}
