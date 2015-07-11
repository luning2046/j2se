package cys.gh.lesson7.concurrent;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *��д������Ϊ������д����������������⣬������д�����⣬������jvm�Լ����Ƶģ���ֻҪ�Ϻ���Ӧ�������ɡ�
 *�����Ĵ���ֻ�����ݣ����Ժܶ���ͬʱ����������ͬʱд���Ǿ��϶����������Ĵ����޸����ݣ�ֻ����һ������д��
 *�Ҳ���ͬʱ��ȡ���Ǿ���д������֮������ʱ���϶�����д��ʱ����д����
 *
 *��д����ʹ�ó�����
 *	һ�δ�����  ���ֻ�ж�����  ��ʵ�Ͳ���������    ��������δ�����������ж�����д���Ǿ���Ҫ
 *   ������5.0֮ǰֻ����  synchronized ��ʽ�����۶�д�߳�  ��Ҫ�ȴ�  ֻ��һ���߳̽��ж�д
 *   ��5.0֮�󣬾����˶�д����
 */
public class T04_ReadWriteLockTest {
	
	public static void main(String[] args) {
		final Queue3 q3 = new Queue3();
		for(int i=0;i<3;i++){
			new Thread(){
				public void run(){
					while(true){
						q3.get();						
					}
				}
			}.start();

			new Thread(){
				public void run(){
					while(true){
						q3.put(new Random().nextInt(10000));
					}
				}			
			}.start();
		}
	}
}

/**
 *  ��д������⣺
 *    ��������������Դ���߳�r1\r2\r3��������д������Դ���߳�w1\w2\w3 
 *   ����һ
 *   r1��һ����ʼִ��
 *   ��r1ִ�е�   rwl.readLock().lock()���ʱ��Ϊ������Դ�����ˣ�ͬʱ֪�����������Ƕ����ݣ������žͽ���  ���������ڲ�����
 *   			ִ�У�����ͣ�ˡ�
 *      ��ʱ��w1��ʼִ�У�ִ�е�rwl.writeLock().lock()ʱ������r1�Ѿ�������ͬʱ֪��w1Ҫд���ݣ�w1�ȴ���
 *      ��ʱ��r2��ʼִ�У�ִ�е�   rwl.readLock().lock()���ʱ����Ȼr1�Ѿ�������ͬʱ֪��r2Ҫ�����ݣ�r2����  ���������ڲ�����ִ�С�
 *      		ִ����Ϻ����
 */
class Queue3{
	private Object data = null;//�������ݣ�ֻ����һ���߳���д�����ݣ��������ж���߳�ͬʱ�������ݡ�
	
	ReadWriteLock rwl = new ReentrantReadWriteLock();//��д��
	
	public void get(){//��
		rwl.readLock().lock();//�϶���
		try {
			System.out.println(Thread.currentThread().getName() + " be ready to read data!");
			Thread.sleep((long)(Math.random()*1000));
			System.out.println(Thread.currentThread().getName() + "have read data :" + data);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			rwl.readLock().unlock();
		}
	}
	
	public void put(Object data){//д

		rwl.writeLock().lock();//��д��
		try {
			System.out.println(Thread.currentThread().getName() + " be ready to write data!");					
			Thread.sleep((long)(Math.random()*1000));
			this.data = data;		
			System.out.println(Thread.currentThread().getName() + " have write data: " + data);					
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			rwl.writeLock().unlock();
		}
	}
}
