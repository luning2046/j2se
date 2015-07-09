package cys.gh.lesson9_1;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * �ܵ������������  �����߳�֮���ͨ��
 * ������ �������߳�  ���������߳������Ϣ
 */
public class T_7_PipedInOutputStream {
	
	public static void main(String[] args) {
		PipedOutputStream po = new PipedOutputStream();
		PipedInputStream pi = new PipedInputStream();
		try {
			//����������ܵ���ͨ
			po.connect(pi);
			new Producer(po).start();
			new Consumer(pi).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
class Producer extends Thread{
	private PipedOutputStream po;
	
	public Producer(PipedOutputStream po){
		this.po=po;
	}
	public void run(){
		try {
			po.write("hello welcome you!".getBytes());
			po.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Consumer extends Thread{
	private PipedInputStream pi;
	
	public Consumer(PipedInputStream pi){
		this.pi=pi;
	}
	public void run(){
		byte[] b = new byte[100];
		try {
			int len = pi.read(b);
			System.out.println(new String(b,0,len));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
