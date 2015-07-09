package cys.gh.lesson9_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * InputStreamReader 将字节流转换为字符流
 * Java用Unicode来表示字符串和字符，Reader和Writer这两个抽象类读写字符流
 * 
 * 	从InputStream/OutputStream------到------Reader/Writer
	是通过InputStreamReader/OuputStreamWriter这个桥来转换的 
	Reader/Writer也是以InputStream/OutputStream为基础的 实现读写的

 */
public class T_9_1_OutputStreamWriterTest {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("ksdjfajf雕刻技法");
		bw.flush();
		bw.close();
		
		FileInputStream fis = new FileInputStream("1.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
	}
}
