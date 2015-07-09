package cys.gh.io;

import java.io.File;
import java.io.FileInputStream;

public class Test1 {
	/*
	 * 读取一般文本文件
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		File pic = new File("h:\\aa.txt");
		int b=0;
		in = new FileInputStream(pic);
		//一个字节字节的读，因为在java中一个字符用Unicode编码两个字节表示
		while((b=in.read())!=-1){
			System.out.print((char)b);
	    }
	}
}
