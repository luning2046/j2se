package cys.gh.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_1_Client {


	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",1982);
			
			Thread.sleep(3000);
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("hello server");
			dos.close();
//			s.getOutputStream();
//			s.close();
			Thread.sleep(5000);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}