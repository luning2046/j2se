package cys.gh.lesson9_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * InputStreamReader ���ֽ���ת��Ϊ�ַ���
 * Java��Unicode����ʾ�ַ������ַ���Reader��Writer�������������д�ַ���
 * 
 * 	��InputStream/OutputStream------��------Reader/Writer
	��ͨ��InputStreamReader/OuputStreamWriter�������ת���� 
	Reader/WriterҲ����InputStream/OutputStreamΪ������ ʵ�ֶ�д��

 */
public class T_9_1_OutputStreamWriterTest {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("ksdjfajf��̼���");
		bw.flush();
		bw.close();
		
		FileInputStream fis = new FileInputStream("1.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
	}
}
