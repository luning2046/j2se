package cys.gh.lessona11;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������һ���򵥵�socket����   �ͻ��������Ϸ�������һ����Ϣ  ���������ղ���ӡ���
 * �����������ͻ������ӷ�����
 * ���ǣ������ǣ���һ���ͻ��������������󣬲�û����������������ݣ��ͳ�������
 * ��ô����������ִ�е�dis.readUTF();���� ������������ͻ��˻�û��������Ϣ����ʱ
 * ����������������ȴ�����˴�ʱ�����ͻ��˳���Ͳ������ӵ��������ˡ�
 */
public class TCP_1_Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1982);//�����˿ں�
			while(true){
				Socket s = ss.accept();
				System.out.println("�пͻ�������������"+s.getInetAddress().getHostName());
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
