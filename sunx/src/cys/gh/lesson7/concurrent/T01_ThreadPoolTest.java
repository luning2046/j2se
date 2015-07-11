package cys.gh.lesson7.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 在线程池的编程模式下，任务是提交给整个线程池，而不是直接交给某个线程，线程池在拿到任务后，
 * 它就在内部找有无空闲的线程，再把任务交给内部某个空闲的线程，这就是封装。记住，任务是提交给整个线程池
 * ，一个线程同时只能执行一个任务，但可以同时向一个线程池提交多个任务。
 * 
 * 基本原理是：线程池中有一个任务队列q、一个监控任务队列的线程c、若个处理任务的线程m（一个线程只能处理一个任务，
 *    处理一个任务才可以处理另一个任务）：
 *    如用户将5个任务提交给线程池，首先线程池将5个任务放入任务队列，开启线程c，开启3个线程m
 *    							  其次 c监控到 q中有任务了，那么c先将3个任务取出，分别分配给3个m
 *    							 再次 当一个m处理完自己的任务后，就wait，此时c监控到这个wait线程，同时任务
 *    								队列中还有任务，那么c就再取出一个任务，同时notify这个线程来处理这个任务直到任务队列为null了 
 */
public class T01_ThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ExecutorService threadPool = Executors.newFixedThreadPool(3);//创建一个有3个线程的固定数量线程池
		ExecutorService threadPool = Executors.newCachedThreadPool();//开启几个线程由线程池自动控制，同时线程池还自动决定是否
																	//将多余的线程超时后关闭
//		ExecutorService threadPool = Executors.newSingleThreadExecutor();//线程池只有一个线程，线程池保证池中只有一个线程
		for(int i=1;i<=10;i++){//创建10个任务
			final int task = i;
			threadPool.execute(new Runnable(){//每一个Runable对应一个任务
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
		System.out.println("all of 10 tasks have committed! ");//执行完此句后，主线程结束，但进程还没有结束。因为线程池中线程还存活着呢！
//		threadPool.shutdownNow();//执行到此句后，立刻关闭线程此，不管任务是否处理完毕
//		threadPool.shutdown();//线程池中所有任务处理完毕了，关闭线程池
//====================================================================================================		
//		Executors.newScheduledThreadPool(3).scheduleAtFixedRate(//定时器线程池，功能类似  Timer
//				new Runnable(){
//					@Override
//				public void run() {
//					System.out.println("bombing!");
//					
//				}},
//				6,//单位是秒
//				2,
//				TimeUnit.SECONDS);//单位  秒 、毫秒  系统默认是毫秒   使用这个就可指定单位
	}

}
