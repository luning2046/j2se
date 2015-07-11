package cys.gh.lesson7.concurrent;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *读写锁：分为读锁和写锁，多个读锁不互斥，读锁与写锁互斥，这是由jvm自己控制的，你只要上好相应的锁即可。
 *如果你的代码只读数据，可以很多人同时读，但不能同时写，那就上读锁；如果你的代码修改数据，只能有一个人在写，
 *且不能同时读取，那就上写锁。总之，读的时候上读锁，写的时候上写锁！
 *
 *读写锁的使用场景：
 *	一段代码中  如果只有读数据  其实就不用上锁了    但是这个段代码中如果即有读又有写，那就需要
 *   上锁，5.0之前只能用  synchronized 方式，无论读写线程  都要等待  只有一个线程进行读写
 *   而5.0之后，就有了读写锁。
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
 *  读写锁的理解：
 *    有三个读共享资源的线程r1\r2\r3；有三个写共享资源的线程w1\w2\w3 
 *   场景一
 *   r1第一个开始执行
 *   当r1执行到   rwl.readLock().lock()这句时，为共享资源上锁了，同时知道后续代码是读数据，紧接着就进入  锁定代码内部代码
 *   			执行，并暂停了。
 *      此时当w1开始执行，执行到rwl.writeLock().lock()时，由于r1已经上锁，同时知道w1要写数据，w1等待。
 *      这时当r2开始执行，执行到   rwl.readLock().lock()这句时，虽然r1已经上锁，同时知道r2要读数据，r2进入  锁定代码内部代码执行。
 *      		执行完毕后解锁
 */
class Queue3{
	private Object data = null;//共享数据，只能有一个线程能写该数据，但可以有多个线程同时读该数据。
	
	ReadWriteLock rwl = new ReentrantReadWriteLock();//读写锁
	
	public void get(){//读
		rwl.readLock().lock();//上读锁
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
	
	public void put(Object data){//写

		rwl.writeLock().lock();//上写锁
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
