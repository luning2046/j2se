package cys.gh.lesson7;

public class MultiThread_1 {

	/**
	 * �򵥵��߳�
	 * main��������һ��Ĭ�ϵ����߳�
	 */
	public static void main(String[] args) {
		//currentThread()��õ�ǰ���е��߳����ã����󣩣�getName�������������������
		System.out.println(Thread.currentThread().getName());
		
		//����ͨ��Thread1 t1 = new Thread1("�߳���");���췽�����߳�ָ��һ������
		//û��ָ������jvmĬ��ָ��һ������ ������������߳���Ϊ  Thread_0
		Thread1 t1 = new Thread1();
		t1.start();
		//t1.start();��ʱ�׳��쳣��һ���߳�ֻ�ܿ���һ��
	}

}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
