package cys.gh.lesson7.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *������ V_eConsumerProducer_7_3������ȫһ��
 *ֻ��ʹ��condition�·�ʽ������wait��notify
 */
public class T06_ConditionCommunication {

	public static void main(String[] args){
		Queue2 q = new Queue2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);
		
		Thread p1 = new Thread(p);  p1.start();//����һ��������p1 
		Thread c1 = new Thread(c);  c1.start();//����һ��������c1
		
		Thread p2 = new Thread(p);  p2.start();//����һ��������p2
		Thread c2 = new Thread(c);  c2.start();//����һ��������c2
	}
}

class Queue2{
	
	int value;
	boolean bFull=false;
	int index = 0;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	public  void put() {
		lock.lock();
		while(bFull){//��Ϊ��  ��ȴ����������Ų�Ʒ
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		value=index++;
		bFull=true;
		System.out.println(Thread.currentThread().getName()+"    �����˵�"+value+"����Ʒ==");
		condition.signalAll();
		lock.unlock();
	}
	
	
	public  void get(){
		lock.lock();
		while(!bFull){
			try {
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		bFull=false;
		condition.signalAll();
		System.out.println(Thread.currentThread().getName()+"   �������������˵�"+value+"����Ʒ");
		lock.unlock();
	}
}
//������
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
//������
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