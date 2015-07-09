package cys.gh.lesson9_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * 过滤流 之 缓冲流  和 InputStream/OutputStream的方法基本一致
 * 多了一个flush方法
 */
public class T_5_BufferedInOutputStream {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("cysgh".getBytes());
		bos.flush();
		bos.close();
		
		FileInputStream fis = new FileInputStream("1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] bt = new byte[100];
		int len = bis.read(bt);
		System.out.println(new String(bt,0,len));
		bis.close();
	}
}
