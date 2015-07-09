package cys.gh.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_3_Server {

	/**
	 * ������ϰ����֪��  ��һ��socket���������رպ� ��Ҳ����ִ�б�����dis.close��
	 * ��socketҲ�͹ر���
	 * �˳������ɷ������˲���java.net.SocketException: Socket is closed�쳣
	 * ԭ���� dis.close()֮����ʵsocket����s�Ѿ����ڹر�  �ٴ�ѭ��ִ��s.getInputStream();ʱ������
	 * socket������s�Ѿ��ر���  ���Ի����쳣
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1982);//�����˿ں�
			Socket s = ss.accept();
			System.out.println("�пͻ�������������"+s.getInetAddress().getHostName());
			while(true){
				InputStream is = s.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				System.out.println(dis.readUTF());//�ͻ���û�н���OutputStream��ʱ���ִ�к󣬻���EOFException
				dis.close();
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		
	}
}
