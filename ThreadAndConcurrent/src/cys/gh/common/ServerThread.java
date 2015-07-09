package cys.gh.common;


/**
 * 
      这个程序里有一个Server线程，它需要启动两个Component，
  Server线程需等到Component线程完毕后再继续。
 */
public class ServerThread {

	Object concLock = new Object();
	int count = 2;

	public void runTwoThreads() {
		
		// 启动两个线程去初始化组件
		new Thread(new ComponentThread1(this)).start();
		new Thread(new ComponentThread1(this)).start();
		
		// Wait for other thread
		while (count != 0) {
			synchronized (concLock) {
				try {
					concLock.wait();
					System.out.println("Wake up.");
				} catch (InterruptedException ie) { // 处理异常}
				}
			}
			System.out.println("Server is up.");
		}
	}

	public void callBack() {
		synchronized (concLock) {
			count--;
			concLock.notifyAll();
		}
	}

	public static void main(String[] args) {
		ServerThread server = new ServerThread();
		server.runTwoThreads();
	}
}
