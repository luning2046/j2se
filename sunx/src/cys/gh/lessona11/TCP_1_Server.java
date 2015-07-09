package cys.gh.lessona11;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 本例是一个简单的socket程序   客户端连接上服务器后发一个信息  服务器接收并打印输出
 * 可以允许多个客户端连接服务器
 * 但是，问题是：当一个客户端连到服务器后，并没有向服务器发送数据，就出休眠了
 * 那么，服务器端执行到dis.readUTF();由于 这个连接上来客户端还没有送来信息，此时
 * 服务器程序就在这句等待，因此此时其他客户端程序就不能连接到服务器了。
 */
public class TCP_1_Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1982);//参数端口号
			while(true){
				Socket s = ss.accept();
				System.out.println("有客户端连接上来了"+s.getInetAddress().getHostName());
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
