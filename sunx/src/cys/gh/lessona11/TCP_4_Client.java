package cys.gh.lessona11;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_4_Client {

	public static void main(String[] args) throws Exception{
		try {
			Socket s = new Socket("127.0.0.1",1982);
			
			/*
			 * 这个客户端连接到了服务器端，此时该客户端休眠了，如果服务器端
			 * 准备接收  该客户端的输出流，那么  其他客户端连不上服务器。
			 */
		//	Thread.sleep(10000);
			
			OutputStream os = s.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("hell server");
			bw.flush();
			bw.close();
//			DataOutputStream dos = new DataOutputStream(os);
//			dos.writeUTF("hello server");
//			dos.close();
			s.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
