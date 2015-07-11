package cys.gh.lesson7;
/*
 * V_eConsumerProducer_7_2就是在V_eConsumerProducer_7_1基础上开启多个生产者和消费者
 * 多个生产者和多个消费者是有个问题的，一旦开启多余两个线程执行代码，就会产生线程安全问题
 * 		具体问题的描述在代码中，造成这个问题的一个原因就是，不能唤醒指定线程
 * 此代码并不是解决此问题，而是分析发生此问题的原因，V_eConsumerProducer_7_3才是解决此问题的代码    
 * 解决方法就是将V_eConsumerProducer_7_1中的
 * 	1.if语句换为while语句
 *  2.将notify变成nofigyAll   notity不能唤醒一个指定的等待线程，只是在多个等待线程
 *  		中随机由jvm选定。后期jdk5.0中concurrent包中提供了类似的功能
 *  
 *  V_eConsumerProducer_7_3的代码就按上述解决方案处理后的正确代码
 */
public class V_eConsumerProducer_7_2 {

	public static void main(String[] args){
		Queue1 q = new Queue1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		
		Thread p1 = new Thread(p);  p1.start();//启动一个生产者p1 
		Thread c1 = new Thread(c);  c1.start();//启动一个消费者c1
		
		Thread p2 = new Thread(p);  p2.start();//启动一个生产者p2
		Thread c2 = new Thread(c);  c2.start();//启动一个生产者c2
	}
}

class Queue1{
	
	int value;
	boolean bFull=false;
	int index = 0;
	
	/**
	 * 产生的问题的具体场景描述：
	 * 第一个问题“前一个商品生产后没有被消费掉，接着被后一个商品覆盖了”
	 * 	1.当p1生产了第0个商品后put方法正常执行结束，此时p1第二次执行put方法，此时p1 wait，并释放锁
	 * 	2.p2第一次执行put，此时p2 wait并释放锁
	 * 	3.c1执行get，取走第0个商品，可以唤醒p1和p2中一个。如p1被唤醒，
	 * 	4.那么p1就会生产了第1个商品，然后执行notify要唤醒其他wait的线程，此时可能唤醒了p2
	 * 	5.那么p2就生产了第2个商品。由于第1个商品还没被消费，第2个商品已经被生产出来了
	 * 			这就出现问题了   “前一个商品被后一个商品覆盖了”
	 * 
	 * 第二个问题“另一种死锁，两个生产者都wait了；同时另两个消费者也都wait了，这样情况都在等待，也就都不执行了”
	 * 1.最先执行c1时，由于没有商品所以wait，然后解锁，紧接着c2就可以执行，此时也wait
	 * 2.p1生产了第0个商品后执行到notify，会唤醒一个消费者，如c1，此时c1变为“就绪状态”等待cpu执行。
	 * 3.此时与c1同为“就绪状态”还有p1，p2.  那么如果此时cpu选择了p1执行，那么由于
	 * 		上一次p1生产的第0个商品还没有被消费，此时p1 wait，这是cpu选择p2执行，也wait
	 * 4.这是p1，p2，c2 处于“wait暂停状态”。c1“就绪状态”
	 * 5.c1被cpu选中执行，后消费第0个商品，并notify了c2，此时生产者并没生产第1个商品
	 *   所以 c2 wait，此时c1，p1，p2中c1被唤醒，并执行，此时c1也wait了 这是c1，c2，p1，p2都wait了
	 *   就死锁了
	 *   
	 *   造成这个问题的两个个原因就是，不能唤醒指定线程
	 */
	public synchronized void put() {
		
		if(bFull){//不为空  则等待不往容器放产品
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		value=index++;
		bFull=true;
		System.out.println(Thread.currentThread().getName()+"    生成了第"+value+"个产品==");
		notify();
		
	}
	
	
	public synchronized void get(){
		if(!bFull){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		bFull=false;
		notify();
		System.out.println(Thread.currentThread().getName()+"   。。。。消费了第"+value+"个产品");
	}
}
//生产者
class Producer1 implements Runnable{
	Queue1 q;
	public Producer1(Queue1 q){
		this.q=q;
	}
	@Override
	public void run(){
		while(true)
			q.put();
	}
}
//消费者
class Consumer1 implements Runnable{
	Queue1 q;
	public Consumer1(Queue1 q){
		this.q=q;
	}
	@Override
	public void run(){
		while(true)
			q.get();
	}
}