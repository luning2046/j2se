
import java.util.Timer;
import java.util.TimerTask;


/**
 * ��ʱִ��ĳ�δ���
 * 
 */
public class Test{
	
	public static void main(String[] args){
		Timer timer = new Timer(true);
		//timer.schedule();
	}
}
class TT extends TimerTask{
	@Override
	public void run() {
		System.out.println("ÿ��һ��ʱ��ִ��");
	}
}