package cys.gh.lessona11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDP_5_Client {

	public static void main(String[] args) throws Exception{
		//�ͻ��˵�UDP����Ҫ�ж˿� �����˳����ڿͻ�������ʱ��ռ�Ķ˿�
		DatagramSocket ds = new DatagramSocket(8888);
		byte[] buf = "hello".getBytes();
		//�����ݷ�װ�ɰ� �����͸�ָ���ķ�����
		DatagramPacket dp = new DatagramPacket(
					buf,
					buf.length,
					new InetSocketAddress("127.0.0.1",9999)//Ŀ���ַ���˿�
				);
		ds.send(dp);
		ds.close();
	}
}
