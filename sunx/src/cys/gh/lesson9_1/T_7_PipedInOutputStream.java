package cys.gh.lesson9_1;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道的输入输出流  用于线程之间的通信
 * 本例中 生产者线程  向消费者线程输出信息
 */
public class T_7_PipedInOutputStream {
	
	public static void main(String[] args) {
		PipedOutputStream po = new PipedOutputStream();
		PipedInputStream pi = new PipedInputStream();
		try {
			//将输入输出管道接通
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
