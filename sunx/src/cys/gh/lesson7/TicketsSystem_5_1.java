package cys.gh.lesson7;

public class TicketsSystem_5_1 {

	/**
	 * ���̵߳���ʱ�������
	 */
	public static void main(String[] args) {
		SellThread st = new SellThread();
		new Thread(st,"�¸���Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"������Ʊ��").start();
		new Thread(st,"�±���Ʊ��").start();
	}
}

class SellThread implements Runnable{
	private int tickets=100;
	
	public void run(){
		
		while(true){
				if(tickets>0){
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" ====������"+(tickets--)+"��Ʊ");
//					tickets--;
				}
		}
	}
}