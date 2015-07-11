package cys.gh.lesson7;
/*
 * V_eConsumerProducer_7_2������V_eConsumerProducer_7_1�����Ͽ�����������ߺ�������
 * ��������ߺͶ�����������и�����ģ�һ���������������߳�ִ�д��룬�ͻ�����̰߳�ȫ����
 * 		��������������ڴ����У������������һ��ԭ����ǣ����ܻ���ָ���߳�
 * �˴��벢���ǽ�������⣬���Ƿ��������������ԭ��V_eConsumerProducer_7_3���ǽ��������Ĵ���    
 * ����������ǽ�V_eConsumerProducer_7_1�е�
 * 	1.if��任Ϊwhile���
 *  2.��notify���nofigyAll   notity���ܻ���һ��ָ���ĵȴ��̣߳�ֻ���ڶ���ȴ��߳�
 *  		�������jvmѡ��������jdk5.0��concurrent�����ṩ�����ƵĹ���
 *  
 *  V_eConsumerProducer_7_3�Ĵ���Ͱ��������������������ȷ����
 */
public class V_eConsumerProducer_7_2 {

	public static void main(String[] args){
		Queue1 q = new Queue1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		
		Thread p1 = new Thread(p);  p1.start();//����һ��������p1 
		Thread c1 = new Thread(c);  c1.start();//����һ��������c1
		
		Thread p2 = new Thread(p);  p2.start();//����һ��������p2
		Thread c2 = new Thread(c);  c2.start();//����һ��������c2
	}
}

class Queue1{
	
	int value;
	boolean bFull=false;
	int index = 0;
	
	/**
	 * ����������ľ��峡��������
	 * ��һ�����⡰ǰһ����Ʒ������û�б����ѵ������ű���һ����Ʒ�����ˡ�
	 * 	1.��p1�����˵�0����Ʒ��put��������ִ�н�������ʱp1�ڶ���ִ��put��������ʱp1 wait�����ͷ���
	 * 	2.p2��һ��ִ��put����ʱp2 wait���ͷ���
	 * 	3.c1ִ��get��ȡ�ߵ�0����Ʒ�����Ի���p1��p2��һ������p1�����ѣ�
	 * 	4.��ôp1�ͻ������˵�1����Ʒ��Ȼ��ִ��notifyҪ��������wait���̣߳���ʱ���ܻ�����p2
	 * 	5.��ôp2�������˵�2����Ʒ�����ڵ�1����Ʒ��û�����ѣ���2����Ʒ�Ѿ�������������
	 * 			��ͳ���������   ��ǰһ����Ʒ����һ����Ʒ�����ˡ�
	 * 
	 * �ڶ������⡰��һ�����������������߶�wait�ˣ�ͬʱ������������Ҳ��wait�ˣ�����������ڵȴ���Ҳ�Ͷ���ִ���ˡ�
	 * 1.����ִ��c1ʱ������û����Ʒ����wait��Ȼ�������������c2�Ϳ���ִ�У���ʱҲwait
	 * 2.p1�����˵�0����Ʒ��ִ�е�notify���ỽ��һ�������ߣ���c1����ʱc1��Ϊ������״̬���ȴ�cpuִ�С�
	 * 3.��ʱ��c1ͬΪ������״̬������p1��p2.  ��ô�����ʱcpuѡ����p1ִ�У���ô����
	 * 		��һ��p1�����ĵ�0����Ʒ��û�б����ѣ���ʱp1 wait������cpuѡ��p2ִ�У�Ҳwait
	 * 4.����p1��p2��c2 ���ڡ�wait��ͣ״̬����c1������״̬��
	 * 5.c1��cpuѡ��ִ�У������ѵ�0����Ʒ����notify��c2����ʱ�����߲�û������1����Ʒ
	 *   ���� c2 wait����ʱc1��p1��p2��c1�����ѣ���ִ�У���ʱc1Ҳwait�� ����c1��c2��p1��p2��wait��
	 *   ��������
	 *   
	 *   �����������������ԭ����ǣ����ܻ���ָ���߳�
	 */
	public synchronized void put() {
		
		if(bFull){//��Ϊ��  ��ȴ����������Ų�Ʒ
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		
		value=index++;
		bFull=true;
		System.out.println(Thread.currentThread().getName()+"    �����˵�"+value+"����Ʒ==");
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
		System.out.println(Thread.currentThread().getName()+"   �������������˵�"+value+"����Ʒ");
	}
}
//������
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
//������
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