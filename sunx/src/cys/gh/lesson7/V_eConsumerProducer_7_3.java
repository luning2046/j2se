package cys.gh.lesson7;
/*
 * V_eConsumerProducer_7_2������V_eConsumerProducer_7_1�����Ͽ�����������ߺ�������
 * ��������ߺͶ�����������и�����ģ�һ���������������߳�ִ�д��룬�ͻ�����̰߳�ȫ����  
 * 		��������������ڴ�����     �����������һ��ԭ����ǣ����ܻ���ָ���߳�
 * �˴�����ǽ��������    
 * ����������ǽ�V_eConsumerProducer_7_1�е�
 * 	1.if��任Ϊwhile���
 *  2.��notify���nofigyAll   notity���ܻ���һ��ָ���ĵȴ��̣߳�ֻ���ڶ���ȴ��߳�
 *  		�������jvmѡ��������jdk5.0��concurrent�����ṩ�����ƵĹ���
 */
public class V_eConsumerProducer_7_3 {

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
	
	public synchronized void put() {
		
		while(bFull){//��Ϊ��  ��ȴ����������Ų�Ʒ
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		value=index++;
		bFull=true;
		System.out.println(Thread.currentThread().getName()+"    �����˵�"+value+"����Ʒ==");
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
		System.out.println(Thread.currentThread().getName()+"   �������������˵�"+value+"����Ʒ");
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