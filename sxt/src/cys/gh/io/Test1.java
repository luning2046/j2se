package cys.gh.io;

import java.io.File;
import java.io.FileInputStream;

public class Test1 {
	/*
	 * ��ȡһ���ı��ļ�
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		File pic = new File("h:\\aa.txt");
		int b=0;
		in = new FileInputStream(pic);
		//һ���ֽ��ֽڵĶ�����Ϊ��java��һ���ַ���Unicode���������ֽڱ�ʾ
		while((b=in.read())!=-1){
			System.out.print((char)b);
	    }
	}
}
