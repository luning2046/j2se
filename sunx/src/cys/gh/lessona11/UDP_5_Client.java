package cys.gh.lessona11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDP_5_Client {

	public static void main(String[] args) throws Exception{
		//客户端的UDP连接要有端口 ，即此程序在客户端运行时所占的端口
		DatagramSocket ds = new DatagramSocket(8888);
		byte[] buf = "hello".getBytes();
		//将数据封装成包 ，发送给指定的服务器
		DatagramPacket dp = new DatagramPacket(
					buf,
					buf.length,
					new InetSocketAddress("127.0.0.1",9999)//目标地址及端口
				);
		ds.send(dp);
		ds.close();
	}
}
