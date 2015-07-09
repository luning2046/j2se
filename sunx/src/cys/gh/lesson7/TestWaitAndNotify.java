package cys.gh.lesson7;

public class TestWaitAndNotify {

	public static void main(String[] args) {
		CC cc = new CC();
		new Thread(cc).start();
	}

	public static class CC implements Runnable{
		@Override
		public void run() {
			synchronized (this) {
				System.out.println("uuuu");
				try {notify();} catch (Exception e) {e.printStackTrace();}//notify时，即输出uuuu有输出dddd
//				try {wait();} catch (Exception e) {e.printStackTrace();}//wait时，只输出uuuu这句
				System.out.println("dddd");
			}
		}
	}
}
