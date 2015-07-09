package cys.gh.lesson9_2;

import java.io.IOException;

/*
 * java和xp平台之间编码解码的过程例子
 */
public class T_2_CodeEnCodeProcess {

	/**
	 * jvm默认编码方式是GBK
	 * 
	 */
	public static void main(String[] args) throws IOException {

		String str = "中国";//保存的时候这个字符串的时候  将此保存到jvm时 为unicode编码
		
		//输出的时候，将这个字符串“中国”的Unicode码值，默认的用GBK解码
		System.out.println(str.getBytes("gbk").length+"---"+new String(str.getBytes("gbk"),"gbk"));
		
		//输出的时候，将这个字符串“中国”的Unicode码值，默认的用utf-8解码
		System.out.println(str.getBytes("utf-8").length+"---"+new String(str.getBytes("gbk"),"utf-8"));

		//输出的时候，将这个字符串“中国”的Unicode码值，默认的用ISO-8859-1解码
		System.out.println(str.getBytes("ISO-8859-1").length+"---"+new String(str.getBytes("gbk"),"ISO-8859-1"));
	}
}
