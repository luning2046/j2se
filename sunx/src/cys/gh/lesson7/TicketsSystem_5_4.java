package cys.gh.lesson7;

public class TicketsSystem_5_4 {

	/**
	  ����߳�ֻҪ����  ͬһ������Ӧ�ķ�������ô��Щ�̶߳���ͬ���� ����������̰߳�ȫ����
	 */
	public static void main(String[] args) {
		final Resource r = new Resource();
		new Thread(new Runnable() {
			@Override
			public void run() {
				r.sell_1();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				r.sell_1();
			}
		}).start();
	}

}

/**
 * ���������������ͬsychronized������������������ͬһ����  Ҳ����  ��this�������
 *  ��˾���  �����̷ֱ߳������������������Ȼ�ǻ��⣬������� �̰߳�ȫ������
 */
class Resource{
	private int tickets=100;
	
	public synchronized void sell_1(){//��this��
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+" ====������"+tickets+"��Ʊ");
			tickets--;
		}
	}
	
	public synchronized void sell_2(){//��this��
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+" ====������"+tickets+"��Ʊ");
			tickets--;
		}
	}
	
	public synchronized static void method(){//��̬������Ӧ������  Resource.class������һ��Class����
		
	}
	
	
}