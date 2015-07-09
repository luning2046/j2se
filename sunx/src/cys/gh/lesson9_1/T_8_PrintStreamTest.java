package cys.gh.lesson9_1;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * printStream是outputStrea中的过滤流
 * print方法 可以向数据源 打印基本数据类型和字符串
 * System.out就是一个printStream对象
 * 与outputStream的区别是  outputStream的方法write只能先字节   而 print方法 可以写任何的数据类型
 */
public class T_8_PrintStreamTest {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("aaaa打飞机");
		ps.println("打开附加诶");
		ps.println(1200);
		ps.close();
	}
}
