import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;


public class Test1 {

	/**
	 * ��ʱ��Timer
	 * 	5��֮��ִ��һ�������������ִ��֮��  ���timer��û�н���
	 *  ֻ�е�����timer.cancel�������Ž���
	 */
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new Task(){
			public void run() {
				Date d = new Date();
				System.out.println(Thread.currentThread().getName()+"=="+d);
			}
		},
		2000);//�����  ִ��һ������Task.
	}
}

