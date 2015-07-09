package cys.gh.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_2_Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1982);//参数端口号
			Socket s = ss.accept();
			System.out.println("有客户端连接上来了"+s.getInetAddress().getHostName());
			while(true){
				InputStream is = s.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				System.out.println(dis.readUTF());//客户端没有建立OutputStream此时这句执行后，会抛EOFException
//				dis.close();
//				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		
	}
}
