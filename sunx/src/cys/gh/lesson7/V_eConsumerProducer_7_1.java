package cys.gh.lesson7;
/*
 * 线程同步 ====生产者和消费者问题
 * wait和notify方法是用在synchornized方法中
 * 核心思想就是   多个线程围绕在“同一把锁”的周围，如果“这把锁 被一个线程锁定了”那么其他
 * 线程在“这把锁”的等待队列中等待。那么什么时候解锁呢？
 *  答：1.一旦某个线程执行了wait方法，那么就解锁了，其他线程就可进入锁中的代码块执行
 *  		此时wait所在的线程就不执行的，这个线程就处于“等待状态”需要被notify唤醒，唤醒后进入“就绪状态”
 *  		从wait的这个特点：可以看出wait和sleep的区别
 *  		   在同步中（也就是在synchronized块中），对cpu的执行权和锁的处理不同
 *  			wait：释放执行权，并释放锁  而 sleep：释放执行权，不释放锁
 *      2.某个线程执行完了那么就解锁了。  等待解锁的线程处于“就绪状态”，会被cpu选择执行。
 *  此代码只适合  开启两个线程，开启两个线程以上  就会可能出错
 */
public class V_eConsumerProducer_7_1 {

	public static void main(String[] args){
		Queue q = new Queue();
		new Producer("gh",q).start();//启动一个叫gh的生产者
		new Consumer("cys",q).start();//启动一个叫cys的消费者
	}
}

//生产者和消费者交互的容器
class Queue{
	int value;//容器 相当于一个框  只能容纳一个东西  即是 "共享资源"
	boolean bFull=false;//true表示 容器已满  false表示容器为空
	
	//临界资源
	public synchronized void put(int i) {
		if(!bFull){//为空  则往容器放产品
			value=i;//放入产品
			bFull=true;//执行完value=i;语句之后，此时容器已满，所以bFull=true
			notify();//不为空,通知消费者线程从容器中取走产品
		}
		try {//由于上述语句的执行之后，容器已满，所以“等待”
			//如果 容器已满，让生产者等待，生产者线程进入等待队列
			//即是  暂停生产者线程执行
			//（暂停put(int i)函数执行，因为生产者线程调用了put(int i)函数）
			wait();//一旦某个线程执行了wait方法，那么就解锁了，其他线程就可进入锁中的代码块执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//临界资源
	public synchronized int get(){
		if(!bFull){//当容器为空时 ，消费者等待
			try {
				wait();//执行到此句后，就停止在这句了，等唤醒后继续执行下面的语句。
					   //被唤醒了也就说明“消费者已经将产品消耗掉了，所以紧接着下一句代码就是bFull=false说明容器空了“
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//执行到这句说明不空了，消费者取走产品
		bFull=false;//所谓取走产品就是 将容器是否为满标记bFull设置为false就可以了 
		notify();//此时通知生产者继续生产产品，也就是将value的值用新值覆盖就表示又生产了新产品
		
		return value;
	}
}
//生产者
class Producer extends Thread{
	Queue q;
	public Producer(String name,Queue q){
		super(name);
		this.q=q;
	}
	public Producer(Queue q){
		this.q=q;
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			q.put(i);
			System.out.println(getName()+"    生成了第"+i+"个产品");
		}
	}
}
//消费者
class Consumer extends Thread{
	Queue q;
	public Consumer(String name,Queue q){
		super(name);
		this.q=q;
	}
	public Consumer(Queue q){
		this.q=q;
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+"   消费了第"+q.get()+"个产品");
		}
	}
}