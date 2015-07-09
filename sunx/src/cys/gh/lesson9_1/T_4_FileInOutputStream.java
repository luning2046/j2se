package cys.gh.lesson9_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 磁盘文件的输入输出流 （节点流）
 * FileOutputStream节点流 只有
 *   void write(int a),void write(byte[] bs),void write(byte[] bs,int off,int len)
 *   三个写入方法 一般使用后两种，第一种不常用
 *   
 * FileInputStream节点流 有
 * 	int read(),  返回值表示每个字节对应的整数
 * 	int read(byte[] b), 返回值表示读到的字节个数
 * 	int read(byte[] b,int off,int len) 返回值表示读到的字节个数
 * 按字节读，必然一个字节能对应一个整数
 */
public class T_4_FileInOutputStream {

	public static void main(String[] args) throws IOException{
		
//		FileOutputStream fos = new FileOutputStream("1.txt");
//		fos.write("kdsjf".getBytes());
//		fos.close();
		FileInputStream fis = new FileInputStream("1.txt");
		//方式1
//		int data = 0;
//		while((data = fis.read())!=-1){//这个方法就是一个字节一个字节的读，直到文件末尾(-1)
//			System.out.print((char)data);
//		}
		//方式2
		byte[] bt = new byte[100];
		int len = fis.read(bt);//表示读到的字节长度
		System.out.println(new String(bt,0,len));
		for(int i=0;i<len;i++){//这个跟while((data = fis.read())!=-1)功能相同
			System.out.println(bt[i]);
		}
		System.out.println(len);
		System.out.write(bt,0,len);
	}
}
