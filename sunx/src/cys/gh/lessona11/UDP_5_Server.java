package cys.gh.lessona11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_5_Server {

	/**
	 *UDP:�������������紫��
	 */
	public static void main(String[] args) throws Exception {
		//����һ��UDP���Ӽ��˿�
		DatagramSocket ds = new DatagramSocket(9999);
		byte[] buf = new byte[100];//���տͻ��˴��ݹ���������
		DatagramPacket dp = new DatagramPacket(buf,buf.length);//��װһ��byte���� �������տͻ��˴��ݵ�����
		while(true){
			ds.receive(dp);//��������
			System.out.println(new String(buf,0,dp.getLength()));//�����յ��������
		}
	}

}
