package cys.gh.lessona11;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * �÷������˳��� ͨ���̵߳ķ�ʽ  �����������
 * ���ڿͻ�������ʱ�����ͻ������Ӳ��� �������˵����⡣
 */
public class TCP_2_Server {

	public static void main(String[] args){
		ServerSocket ss;
		try {
			ss = new ServerSocket(4321);
			while(true){
				Socket s = ss.accept();//ÿ��һ���ͻ������� ����Ϊ�ÿͻ��˽���һ��Socket��
				System.out.println("a client connected!");
				DataInputStream dis = new DataInputStream(s.getInputStream());
				new DoStream(dis,s).start();//ÿ��һ���ͻ������� ��������һ�����̴߳��������
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * ÿ��һ���ͻ������ӷ�����������һ���̴߳���ÿͻ��˵��������
 * �������Ϳ��Լ������������ͻ��������ˡ�
 * ���߳� ----���տͻ��˵��������
 */
class DoStream extends Thread{
	DataInputStream dis;
	Socket s;
	public DoStream(DataInputStream dis,Socket s){
		this.dis=dis;
		this.s=s;
	}
	@Override
	public void run() {
		try {
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				dis.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
