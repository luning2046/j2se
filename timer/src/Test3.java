import java.util.Timer;
import java.util.TimerTask;


public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//2���ִ������Ȼ��ÿ��3���ٴ�ִ������
//		new Timer().schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("=======================");
//			}
//		},2000, 3000);
		
		//����Timerʵ��ѭ��ִ��   ʵ�ָ����ӵĶ�ʱ��   �п�Դ�Ĺ��߽�quartz
		class MM extends TimerTask{
			@Override
			public void run() {
				System.out.println("=========ѭ��=============");
				new Timer().schedule(new MM(),2000);
			}
		}

		new Timer().schedule(new MM(),2000);	
		
		
	}

}
