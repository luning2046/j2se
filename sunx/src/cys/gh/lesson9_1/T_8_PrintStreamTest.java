package cys.gh.lesson9_1;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * printStream��outputStrea�еĹ�����
 * print���� ����������Դ ��ӡ�����������ͺ��ַ���
 * System.out����һ��printStream����
 * ��outputStream��������  outputStream�ķ���writeֻ�����ֽ�   �� print���� ����д�κε���������
 */
public class T_8_PrintStreamTest {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("1.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("aaaa��ɻ�");
		ps.println("�򿪸�����");
		ps.println(1200);
		ps.close();
	}
}
