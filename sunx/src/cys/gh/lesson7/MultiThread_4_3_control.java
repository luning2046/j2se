package cys.gh.lesson7;

import java.util.ArrayList;
import java.util.List;

/**
 * 本例是  主线程控制  多个线程顺序执行 
 * @author Administrator
 *
 */
public class MultiThread_4_3_control {

	public static void main(String[] args) {
		List<ThreadTest1> list = new ArrayList<ThreadTest1>();
		boolean alldeads = true; 
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest1 t2 = new ThreadTest1();
		ThreadTest1 t3 = new ThreadTest1();
	
		list.add(t1);
		list.add(t2);
		list.add(t3);
		int i=0;
		while(true){
			System.out.println("====================="+Thread.currentThread().getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			for(ThreadTest1 tt : list){
				if(tt.isAlive()) {
					alldeads=false;
					break;
				}
				alldeads=true;
			}
			if(alldeads){
				if(i<list.size()){
					list.get(i).start();
					i++;
				}else{
					break;
				}
			}
		}
	}
}
class ThreadTest1 extends Thread{
	
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(300);
			}catch(Exception e){}
			System.out.println("====================="+getName());
		}
	}
}
