package cys.gh.common;

public class ComponentThread1 implements Runnable {

	private ServerThread server;

	public ComponentThread1(ServerThread server) {
		this.server = server;
	}

	public void run() {
		// 做组件初始化的工作
		System.out.println("Do component initialization.");
		server.callBack();
	}

}
