package cys.gh.lesson7.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
/**
 *Semaphore����ά����ǰ����������̸߳��������ṩ��ͬ�����ơ�ʹ��Semaphore���Կ���ͬʱ������Դ���̸߳��������磬ʵ��һ���ļ�����Ĳ�����������
  Semaphoreʵ�ֵĹ��ܾ����Ʋ�����5���ӣ�������ʮ����Ҫ�ϲ�������ôͬʱ���ж��ٸ���ȥ�ϲ����أ�ͬʱֻ����5�����ܹ�ռ�ã���5�����е��κ�һ�����ÿ���
    �����ڵȴ�������5����������һ������ռ���ˡ�
    ����ȴ���5�����п��������������Ȼ��ᣬҲ�����ǰ��������󵽵�˳���û��ᣬ��ȡ���ڹ���Semaphore����ʱ����Ĳ���ѡ�
     �����ź�����Semaphore�������ʵ�ֻ������Ĺ��ܣ����ҿ�������һ���̻߳���ˡ�������������һ���߳��ͷš����������Ӧ���������ָ���һЩ���ϡ�
 *
 */
public class T07_SemaphoreTest {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		final  Semaphore sp = new Semaphore(3);
		for(int i=0;i<10;i++){
			Runnable runnable = new Runnable(){
					public void run(){
					try {
						sp.acquire();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println("�߳�" + Thread.currentThread().getName() + 
							"���룬��ǰ����" + (3-sp.availablePermits()) + "������");
					try {
						Thread.sleep((long)(Math.random()*10000));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("�߳�" + Thread.currentThread().getName() + 
							"�����뿪");					
					sp.release();
					//���������ʱ��ִ�в�׼ȷ����Ϊ��û�к�����Ĵ���ϳ�ԭ�ӵ�Ԫ
					System.out.println("�߳�" + Thread.currentThread().getName() + 
							"���뿪����ǰ����" + (3-sp.availablePermits()) + "������");					
				}
			};
			service.execute(runnable);			
		}
	}

}
