package cys.gh.lesson7;
/*
 * 通过实现Runnable接口 定义一个线程
 * 与继承Thread类定义一个线程相比，此种方法是的好处是
 * 	1.能用extend继承其他类（如本例extends Object）
 *  2.在类中能访问成员变量（如本例成员变量count）
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
