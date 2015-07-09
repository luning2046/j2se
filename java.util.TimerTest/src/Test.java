
import java.util.Timer;
import java.util.TimerTask;


/**
 * 定时执行某段代码
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
		System.out.println("每个一段时间执行");
	}
}