import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;


public class Test2 {

	/**
	 * ��ʱ��Timer
	 * 	һ�ֹ��ߣ��߳����䰲���Ժ��ں�̨�߳���ִ�е����񡣿ɰ�������ִ��һ�Σ����߶����ظ�ִ�С�
	 * TimerTask ����һ������
	 */
	public static void main(String[] args) {
		Timer t = new Timer();
		
		t.schedule(new Task(t),new Date(),1000);//ָ������ʱ��ִ�У���2013��5��4��21�㿪ʼִ������
												//�����new Date() ��ʾ��ǰʱ�俪ʼִ������  ����֮��ÿ��һ����  ����ִ��һ������Task.
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
			timer.cancel();//����timer
		}
	}
}
