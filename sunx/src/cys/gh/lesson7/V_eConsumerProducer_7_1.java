package cys.gh.lesson7;
/*
 * �߳�ͬ�� ====�����ߺ�����������
 * wait��notify����������synchornized������
 * ����˼�����   ����߳�Χ���ڡ�ͬһ����������Χ������������ ��һ���߳������ˡ���ô����
 * �߳��ڡ���������ĵȴ������еȴ�����ôʲôʱ������أ�
 *  ��1.һ��ĳ���߳�ִ����wait��������ô�ͽ����ˣ������߳̾Ϳɽ������еĴ����ִ��
 *  		��ʱwait���ڵ��߳̾Ͳ�ִ�еģ�����߳̾ʹ��ڡ��ȴ�״̬����Ҫ��notify���ѣ����Ѻ���롰����״̬��
 *  		��wait������ص㣺���Կ���wait��sleep������
 *  		   ��ͬ���У�Ҳ������synchronized���У�����cpu��ִ��Ȩ�����Ĵ���ͬ
 *  			wait���ͷ�ִ��Ȩ�����ͷ���  �� sleep���ͷ�ִ��Ȩ�����ͷ���
 *      2.ĳ���߳�ִ��������ô�ͽ����ˡ�  �ȴ��������̴߳��ڡ�����״̬�����ᱻcpuѡ��ִ�С�
 *  �˴���ֻ�ʺ�  ���������̣߳����������߳�����  �ͻ���ܳ���
 */
public class V_eConsumerProducer_7_1 {

	public static void main(String[] args){
		Queue q = new Queue();
		new Producer("gh",q).start();//����һ����gh��������
		new Consumer("cys",q).start();//����һ����cys��������
	}
}

//�����ߺ������߽���������
class Queue{
	int value;//���� �൱��һ����  ֻ������һ������  ���� "������Դ"
	boolean bFull=false;//true��ʾ ��������  false��ʾ����Ϊ��
	
	//�ٽ���Դ
	public synchronized void put(int i) {
		if(!bFull){//Ϊ��  ���������Ų�Ʒ
			value=i;//�����Ʒ
			bFull=true;//ִ����value=i;���֮�󣬴�ʱ��������������bFull=true
			notify();//��Ϊ��,֪ͨ�������̴߳�������ȡ�߲�Ʒ
		}
		try {//������������ִ��֮���������������ԡ��ȴ���
			//��� �����������������ߵȴ����������߳̽���ȴ�����
			//����  ��ͣ�������߳�ִ��
			//����ͣput(int i)����ִ�У���Ϊ�������̵߳�����put(int i)������
			wait();//һ��ĳ���߳�ִ����wait��������ô�ͽ����ˣ������߳̾Ϳɽ������еĴ����ִ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//�ٽ���Դ
	public synchronized int get(){
		if(!bFull){//������Ϊ��ʱ �������ߵȴ�
			try {
				wait();//ִ�е��˾�󣬾�ֹͣ������ˣ��Ȼ��Ѻ����ִ���������䡣
					   //��������Ҳ��˵�����������Ѿ�����Ʒ���ĵ��ˣ����Խ�������һ��������bFull=false˵���������ˡ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//ִ�е����˵�������ˣ�������ȡ�߲�Ʒ
		bFull=false;//��νȡ�߲�Ʒ���� �������Ƿ�Ϊ�����bFull����Ϊfalse�Ϳ����� 
		notify();//��ʱ֪ͨ�����߼���������Ʒ��Ҳ���ǽ�value��ֵ����ֵ���Ǿͱ�ʾ���������²�Ʒ
		
		return value;
	}
}
//������
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
			System.out.println(getName()+"    �����˵�"+i+"����Ʒ");
		}
	}
}
//������
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
			System.out.println(getName()+"   �����˵�"+q.get()+"����Ʒ");
		}
	}
}