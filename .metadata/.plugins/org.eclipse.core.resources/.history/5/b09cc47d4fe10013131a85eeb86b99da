package cys.gh.lesson7.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;



public class T2_CallableAndFuture {

	/**
	 * 线程执行完毕后 能产生一个返回值 给启用这个线程的代码
	 */
	public static void main(String[] args) {
		ExecutorService threadPool =  Executors.newSingleThreadExecutor();
		Future<String> future =
			threadPool.submit(//提交一个任务，获得返回值
				new Callable<String>() {
					public String call() throws Exception {
						Thread.sleep(2000);
						return "hello";
					};
				}
		);
		System.out.println("等待结果");
		try {
			System.out.println("拿到结果：" + future.get());//等待 任务执行完毕后  获得返回结果
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//====================================================================================================================
		
		/**
		 * CompletionService用于提交一组Callable任务，其take方法返回已完成的一个Callable任务对应的Future对象
		 */
		ExecutorService threadPool2 =  Executors.newFixedThreadPool(10);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool2);
		for(int i=1;i<=10;i++){//提交10个任务
			final int seq = i;
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					Thread.sleep(new Random().nextInt(5000));
					return seq;
				}
			});
		}
		for(int i=0;i<10;i++){
			try {
				System.out.println(
						completionService.take().get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
	

}
