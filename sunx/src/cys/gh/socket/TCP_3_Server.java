package cys.gh.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_3_Server {

	/**
	 * 经过练习可以知道  当一个socket对象获得流关闭后 （也就是执行本例的dis.close）
	 * 该socket也就关闭了
	 * 此程序会造成服务器端产生java.net.SocketException: Socket is closed异常
	 * 原因是 dis.close()之后其实socket对象s已经处于关闭  再次循环执行s.getInputStream();时，由于
	 * socket的引用s已经关闭了  所以会抛异常
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1982);//参数端口号
			Socket s = ss.accept();
			System.out.println("有客户端连接上来了"+s.getInetAddress().getHostName());
			while(true){
				InputStream is = s.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				System.out.println(dis.readUTF());//客户端没有建立OutputStream此时这句执行后，会抛EOFException
				dis.close();
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		
	}
}
