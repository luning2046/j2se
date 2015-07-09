package cys.gh.lesson9_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 过滤流，提供了读写java中的基本数据类型的功能
 */
public class T_6_DataInOutputStream {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		int i=2;
		byte b = 5;
		boolean bool = true;
		double d = 1.245;
		//这txt文件上，打开这个文件时肯定是乱码  ，编码方式不同
		dos.writeInt(i);//输出到文件上  占4个字节
		dos.writeByte(b);//输出到文件上  占1个字节
		dos.writeBoolean(bool);//输出到文件上  占1个字节
		dos.writeDouble(d);//输出到文件上  占8个字节
		dos.close();
		
		//读的顺序要与写的顺序一致
		FileInputStream fis = new FileInputStream("1.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		dis.close();
	}
}
