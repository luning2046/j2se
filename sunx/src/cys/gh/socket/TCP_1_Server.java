package cys.gh.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TCP_1_Server {

	public static void main(String[] args) {
//		try {
//			ServerSocket ss = new ServerSocket(1982);//参数端口号
//			Socket s = ss.accept();
//			
//			System.out.println("有客户端连接上来了"+s.getInetAddress().getHostName());
//			while(true){
//				InputStream is = s.getInputStream();
//				DataInputStream dis = new DataInputStream(is);
//				System.out.println(dis.readUTF());//客户端没有建立OutputStream此时这句执行后，会抛EOFException
////				dis.close();
////				s.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println();
		testCall tc = new testCall();
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future f = es.submit(tc);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.cancel(true);
		
//		es.shutdownNow();
		
	}
}
class testCall implements Callable{

	@Override
	public Object call() throws Exception {
		for(int i=0;i<10;i++){
			System.out.println("================"+i);
			Thread.sleep(500);
		}
//		try {
//			ServerSocket ss = new ServerSocket(1982);//参数端口号
//			Socket s = ss.accept();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		return null;
	}
}