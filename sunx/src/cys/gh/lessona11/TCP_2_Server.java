package cys.gh.lessona11;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 该服务器端程序 通过线程的方式  解决了上例的
 * 由于客户端休眠时其他客户端连接不到 服务器端的问题。
 */
public class TCP_2_Server {

	public static void main(String[] args){
		ServerSocket ss;
		try {
			ss = new ServerSocket(4321);
			while(true){
				Socket s = ss.accept();//每来一个客户端请求 ，就为该客户端建立一个Socket。
				System.out.println("a client connected!");
				DataInputStream dis = new DataInputStream(s.getInputStream());
				new DoStream(dis,s).start();//每来一个客户端请求 ，就启用一个新线程处理该请求。
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * 每来一个客户端连接服务器就启用一个线程处理该客户端的输出操作
 * 服务器就可以继续处理其他客户端请求了。
 * 该线程 ----接收客户端的输出流的
 */
class DoStream extends Thread{
	DataInputStream dis;
	Socket s;
	public DoStream(DataInputStream dis,Socket s){
		this.dis=dis;
		this.s=s;
	}
	@Override
	public void run() {
		try {
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				dis.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
