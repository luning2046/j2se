import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;


public class Test2 {

	/**
	 * 定时器Timer
	 * 	一种工具，线程用其安排以后在后台线程中执行的任务。可安排任务执行一次，或者定期重复执行。
	 * TimerTask 定义一个任务
	 */
	public static void main(String[] args) {
		Timer t = new Timer();
		
		t.schedule(new Task(t),new Date(),1000);//指定具体时间执行（如2013年5月4日21点开始执行任务）
												//本类的new Date() 表示当前时间开始执行任务  并且之后每隔一秒钟  再在执行一次任务Task.
//		System.out.println("===="+Thread.currentThread().getName());
		
	}
}

class Task extends TimerTask{
	private Timer timer;
	
	public Task(){}
	public Task(Timer timer){
		this.timer=timer;
	}
	
	int i=0;
	public void run() {
		Date d = new Date();
		System.out.println(d);
		i++;
		if(i==5){
			timer.cancel();//结束timer
		}
	}
}
