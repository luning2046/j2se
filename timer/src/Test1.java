import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;


public class Test1 {

	/**
	 * 定时器Timer
	 * 	5秒之后执行一个任务，这个任务执行之后  这个timer并没有结束
	 *  只有调用了timer.cancel（）；才结束
	 */
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new Task(){
			public void run() {
				Date d = new Date();
				System.out.println(Thread.currentThread().getName()+"=="+d);
			}
		},
		2000);//两秒后  执行一次任务Task.
	}
}

