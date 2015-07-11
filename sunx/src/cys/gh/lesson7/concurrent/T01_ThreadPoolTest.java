package cys.gh.lesson7.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ���̳߳صı��ģʽ�£��������ύ�������̳߳أ�������ֱ�ӽ���ĳ���̣߳��̳߳����õ������
 * �������ڲ������޿��е��̣߳��ٰ����񽻸��ڲ�ĳ�����е��̣߳�����Ƿ�װ����ס���������ύ�������̳߳�
 * ��һ���߳�ͬʱֻ��ִ��һ�����񣬵�����ͬʱ��һ���̳߳��ύ�������
 * 
 * ����ԭ���ǣ��̳߳�����һ���������q��һ�����������е��߳�c����������������߳�m��һ���߳�ֻ�ܴ���һ������
 *    ����һ������ſ��Դ�����һ�����񣩣�
 *    ���û���5�������ύ���̳߳أ������̳߳ؽ�5���������������У������߳�c������3���߳�m
 *    							  ��� c��ص� q���������ˣ���ôc�Ƚ�3������ȡ�����ֱ�����3��m
 *    							 �ٴ� ��һ��m�������Լ�������󣬾�wait����ʱc��ص����wait�̣߳�ͬʱ����
 *    								�����л���������ôc����ȡ��һ������ͬʱnotify����߳��������������ֱ���������Ϊnull�� 
 */
public class T01_ThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ExecutorService threadPool = Executors.newFixedThreadPool(3);//����һ����3���̵߳Ĺ̶������̳߳�
		ExecutorService threadPool = Executors.newCachedThreadPool();//���������߳����̳߳��Զ����ƣ�ͬʱ�̳߳ػ��Զ������Ƿ�
																	//��������̳߳�ʱ��ر�
//		ExecutorService threadPool = Executors.newSingleThreadExecutor();//�̳߳�ֻ��һ���̣߳��̳߳ر�֤����ֻ��һ���߳�
		for(int i=1;i<=10;i++){//����10������
			final int task = i;
			threadPool.execute(new Runnable(){//ÿһ��Runable��Ӧһ������
				@Override
				public void run() {
					for(int j=1;j<=10;j++){
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + " is looping of " + j + " for  task of " + task);
					}
				}
			});
		}
		System.out.println("all of 10 tasks have committed! ");//ִ����˾�����߳̽����������̻�û�н�������Ϊ�̳߳����̻߳�������أ�
//		threadPool.shutdownNow();//ִ�е��˾�����̹ر��̴߳ˣ����������Ƿ������
//		threadPool.shutdown();//�̳߳�����������������ˣ��ر��̳߳�
//====================================================================================================		
//		Executors.newScheduledThreadPool(3).scheduleAtFixedRate(//��ʱ���̳߳أ���������  Timer
//				new Runnable(){
//					@Override
//				public void run() {
//					System.out.println("bombing!");
//					
//				}},
//				6,//��λ����
//				2,
//				TimeUnit.SECONDS);//��λ  �� ������  ϵͳĬ���Ǻ���   ʹ������Ϳ�ָ����λ
	}

}
