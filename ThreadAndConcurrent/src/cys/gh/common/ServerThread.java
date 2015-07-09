package cys.gh.common;


/**
 * 
      �����������һ��Server�̣߳�����Ҫ��������Component��
  Server�߳���ȵ�Component�߳���Ϻ��ټ�����
 */
public class ServerThread {

	Object concLock = new Object();
	int count = 2;

	public void runTwoThreads() {
		
		// ���������߳�ȥ��ʼ�����
		new Thread(new ComponentThread1(this)).start();
		new Thread(new ComponentThread1(this)).start();
		
		// Wait for other thread
		while (count != 0) {
			synchronized (concLock) {
				try {
					concLock.wait();
					System.out.println("Wake up.");
				} catch (InterruptedException ie) { // �����쳣}
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
