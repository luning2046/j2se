package cys.gh.concurrent1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 这是调用线程类
 */
public class Executor {

	public static void main(String[] args) {
		// *1
		DoCallStuff call1 = new DoCallStuff(0);
		DoCallStuff call2 = new DoCallStuff(1);
		DoCallStuff call3 = new DoCallStuff(2);
		// *2
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		// *3运行Callable任务可拿到一个Future对象，
		//通过Future对象可了解任务执行情况，可取消任务的执行，还可获取任务执行的结果。 
		Future future1 = es.submit(call1);
		Future future2 = es.submit(call2);
		Future future3 = es.submit(call3);
		try {
			// *4//获得任务执行的结果
			System.out.println("任务1执行的结果="+future1.get());
			// *5//取消任务的执行
			Thread.sleep(3000);
			System.out.println("Thread 2 terminated? :" + future2.cancel(true));
			// *6
			System.out.println("任务3执行的结果="+future3.get());
		} catch (ExecutionException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}