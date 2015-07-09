package cys.gh.lessona11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_5_Server {

	/**
	 *UDP:面向无连接网络传输
	 */
	public static void main(String[] args) throws Exception {
		//定义一个UDP连接及端口
		DatagramSocket ds = new DatagramSocket(9999);
		byte[] buf = new byte[100];//接收客户端传递过来的数据
		DatagramPacket dp = new DatagramPacket(buf,buf.length);//封装一下byte数组 ，来接收客户端传递的数据
		while(true){
			ds.receive(dp);//接收数据
			System.out.println(new String(buf,0,dp.getLength()));//将接收的数据输出
		}
	}

}
