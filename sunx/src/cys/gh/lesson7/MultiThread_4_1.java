package cys.gh.lesson7;
/*
 * ͨ��ʵ��Runnable�ӿ� ����һ���߳�
 * ��̳�Thread�ඨ��һ���߳���ȣ����ַ����ǵĺô���
 * 	1.����extend�̳������ࣨ�籾��extends Object��
 *  2.�������ܷ��ʳ�Ա�������籾����Ա����count��
 */
public class MultiThread_4_1 {

	public static void main(String[] args){
		Thread_4 t1 = new Thread_4();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
	}
}

class Thread_4 extends Object implements Runnable {
	private int count=0;
	
	public void run() {
		System.out.println(get());
	}
	public int get(){
		return count++;
	}
}
