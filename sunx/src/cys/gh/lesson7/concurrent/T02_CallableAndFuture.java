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



public class T02_CallableAndFuture {

	/**
	 * �߳�ִ����Ϻ� �ܲ���һ������ֵ ����������̵߳Ĵ���
	 */
	public static void main(String[] args) {
		ExecutorService threadPool =  Executors.newSingleThreadExecutor();
		Future<String> future =
			threadPool.submit(//�ύһ�����񣬻�÷���ֵ����execute������ͬ�����ύһ������
				new Callable<String>() {//�������ֵ��Future�ķ���ֵһ��
					public String call() throws Exception {//�����������Ĵ�������������
						for(int i=0;i<10;i++){
							Thread.sleep(1000);
							System.out.println("===========");
						}
						return "hello";
					};
				}
		);
		System.out.println("�ȴ����");
		try {
			System.out.println("�õ������" + future.get());//�ȴ� ����ִ����Ϻ�  ��÷��ؽ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//====================================================================================================================
		
		/**
		 * CompletionService�����ύһ��Callable������take������������ɵ�һ��Callable�����Ӧ��Future����
		 */
		ExecutorService threadPool2 =  Executors.newFixedThreadPool(10);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool2);
		for(int i=1;i<=10;i++){//�ύ10������
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
