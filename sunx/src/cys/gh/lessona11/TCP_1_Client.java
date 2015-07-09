package cys.gh.lessona11;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_1_Client {

	public static void main(String[] args) {
		try {
//			InetSocketAddress ia = new InetSocketAddress("127.0.0.1",1982);
			Socket s = new Socket("127.0.0.1",1982);
			
			/*
			 * 这个客户端连接到了服务器端，此时该客户端休眠了，如果服务器端
			 * 准备接收  该客户端的输出流，那么  其他客户端连不上服务器。
			 */
			Thread.sleep(10000);
			
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("hello server");
			dos.close();
			s.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
