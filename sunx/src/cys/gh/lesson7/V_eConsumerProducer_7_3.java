package cys.gh.lesson7;
/*
 * V_eConsumerProducer_7_2就是在V_eConsumerProducer_7_1基础上开启多个生产者和消费者
 * 多个生产者和多个消费者是有个问题的，一旦开启多余两个线程执行代码，就会产生线程安全问题  
 * 		具体问题的描述在代码中     造成这个问题的一个原因就是，不能唤醒指定线程
 * 此代码就是解决此问题    
 * 解决方法就是将V_eConsumerProducer_7_1中的
 * 	1.if语句换为while语句
 *  2.将notify变成nofigyAll   notity不能唤醒一个指定的等待线程，只是在多个等待线程
 *  		中随机由jvm选定。后期jdk5.0中concurrent包中提供了类似的功能
 */
public class V_eConsumerProducer_7_3 {

	public static void main(String[] args){
		Queue2 q = new Queue2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);
		
		Thread p1 = new Thread(p);  p1.start();//启动一个生产者p1 
		Thread c1 = new Thread(c);  c1.start();//启动一个消费者c1
		
		Thread p2 = new Thread(p);  p2.start();//启动一个生产者p2
		Thread c2 = new Thread(c);  c2.start();//启动一个生产者c2
	}
}

class Queue2{
	
	int value;
	boolean bFull=false;
	int index = 0;
	
	public synchronized void put() {
		
		while(bFull){//不为空  则等待不往容器放产品
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		value=index++;
		bFull=true;
		System.out.println(Thread.currentThread().getName()+"    生成了第"+value+"个产品==");
		notifyAll();
		
	}
	
	
	public synchronized void get(){
		while(!bFull){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		bFull=false;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+"   。。。。消费了第"+value+"个产品");
	}
}
//生产者
class Producer2 implements Runnable{
	Queue2 q;
	public Producer2(Queue2 q){
		this.q=q;
	}
	@Override
	public void run(){
		while(true)
			q.put();
	}
}
//消费者
class Consumer2 implements Runnable{
	Queue2 q;
	public Consumer2(Queue2 q){
		this.q=q;
	}
	@Override
	public void run(){
		while(true)
			q.get();
	}
}