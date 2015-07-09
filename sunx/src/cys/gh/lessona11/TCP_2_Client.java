package cys.gh.lessona11;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_2_Client {

	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1", 4321);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Thread.sleep(9000);
		dos.writeUTF("hello");
		dos.close();
		s.close();
	}
}
