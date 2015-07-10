import java.util.Timer;
import java.util.TimerTask;


public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//2秒后执行任务，然后每隔3秒再次执行任务
//		new Timer().schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("=======================");
//			}
//		},2000, 3000);
		
		//利用Timer实现循环执行   实现更复杂的定时器   有开源的工具叫quartz
		class MM extends TimerTask{
			@Override
			public void run() {
				System.out.println("=========循环=============");
				new Timer().schedule(new MM(),2000);
			}
		}

		new Timer().schedule(new MM(),2000);	
		
		
	}

}
