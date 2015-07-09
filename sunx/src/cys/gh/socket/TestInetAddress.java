package cys.gh.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	//由于ip地址很重要，在java中奖ip地址封装成一个对象InetAddress
	public static void main(String[] args) throws UnknownHostException {
		//获取本机ip地址对象
		InetAddress iar = InetAddress.getLocalHost();
		String ip = iar.getHostAddress();//本机ip
		String hostName = iar.getHostName();//本机主机名
		System.out.println(ip+"===="+hostName);
		
		//根据指定的主机名获取ip地址对象
		InetAddress i2 = InetAddress.getByName("www.baidu.com");
		ip = i2.getHostAddress();//本机ip
		hostName = i2.getHostName();//本机主机名
		System.out.println(ip+"===="+hostName);
	}

}
