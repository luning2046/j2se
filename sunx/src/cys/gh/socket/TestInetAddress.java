package cys.gh.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	//����ip��ַ����Ҫ����java�н�ip��ַ��װ��һ������InetAddress
	public static void main(String[] args) throws UnknownHostException {
		//��ȡ����ip��ַ����
		InetAddress iar = InetAddress.getLocalHost();
		String ip = iar.getHostAddress();//����ip
		String hostName = iar.getHostName();//����������
		System.out.println(ip+"===="+hostName);
		
		//����ָ������������ȡip��ַ����
		InetAddress i2 = InetAddress.getByName("www.baidu.com");
		ip = i2.getHostAddress();//����ip
		hostName = i2.getHostName();//����������
		System.out.println(ip+"===="+hostName);
	}

}
