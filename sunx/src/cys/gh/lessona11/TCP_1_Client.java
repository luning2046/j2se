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
			 * ����ͻ������ӵ��˷������ˣ���ʱ�ÿͻ��������ˣ������������
			 * ׼������  �ÿͻ��˵����������ô  �����ͻ��������Ϸ�������
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
