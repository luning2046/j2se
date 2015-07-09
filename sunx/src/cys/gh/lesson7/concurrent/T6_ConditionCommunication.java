package cys.gh.lesson7.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T6_ConditionCommunication {

	/**
	 * 在等待 Condition 时，允许发生“虚假唤醒”，这通常作为对基础平台语义的让步。对于大多数应用程序，
	 * 这带来的实际影响很小，因为 Condition 应该总是在一个循环中被等待，并测试正被等待的状态声明。
	 * 某个实现可以随意移除可能的虚假唤醒，但建议应用程序程序员总是假定这些虚假唤醒可能发生，因此总是在一个循环中等待
	 */
	public static void main(String[] args) {
		
		
		final Business business = new Business();
		new Thread(
				new Runnable() {
					
					@Override
					public void run() {
					
						for(int i=1;i<=50;i++){
							business.sub(i);
						}
						
					}
				}
		).start();
		
		for(int i=1;i<=50;i++){
			business.main(i);
		}
		
	}

	static class Business {
			Lock lock = new ReentrantLock();
			Condition condition = lock.newCondition();
		  private boolean bShouldSub = true;
		  public  void sub(int i){
			  lock.lock();
			  try{
				  while(!bShouldSub){
					  try {
						condition.await();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
					for(int j=1;j<=10;j++){
						System.out.println("sub thread sequence of " + j + ",loop of " + i);
					}
				  bShouldSub = false;
				  condition.signal();
			  }finally{
				  lock.unlock();
			  }
		  }
		  
		  public  void main(int i){
			  lock.lock();
			  try{
				 while(bShouldSub){
				  		try {
							condition.await();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				  	}
					for(int j=1;j<=100;j++){
						System.out.println("main thread sequence of " + j + ",loop of " + i);
					}
					bShouldSub = true;
					condition.signal();
		  }finally{
			  lock.unlock();
		  }
	  }
	
	}
}
