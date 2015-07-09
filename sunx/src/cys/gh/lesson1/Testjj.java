package cys.gh.lesson1;

public class Testjj {

	public static void main(String[] args) {
		System.out.println("aaaa\nfjfff");
		MyThread mt = new MyThread();
		mt.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
		mt.stop();
	}
}

class MyThread extends Thread{
	
	public void run(){
		while(true){
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			System.out.println("=============thread============");
		}
	}
}
