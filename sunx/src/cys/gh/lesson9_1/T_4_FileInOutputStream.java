package cys.gh.lesson9_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ļ������������ ���ڵ�����
 * FileOutputStream�ڵ��� ֻ��
 *   void write(int a),void write(byte[] bs),void write(byte[] bs,int off,int len)
 *   ����д�뷽�� һ��ʹ�ú����֣���һ�ֲ�����
 *   
 * FileInputStream�ڵ��� ��
 * 	int read(),  ����ֵ��ʾÿ���ֽڶ�Ӧ������
 * 	int read(byte[] b), ����ֵ��ʾ�������ֽڸ���
 * 	int read(byte[] b,int off,int len) ����ֵ��ʾ�������ֽڸ���
 * ���ֽڶ�����Ȼһ���ֽ��ܶ�Ӧһ������
 */
public class T_4_FileInOutputStream {

	public static void main(String[] args) throws IOException{
		
//		FileOutputStream fos = new FileOutputStream("1.txt");
//		fos.write("kdsjf".getBytes());
//		fos.close();
		FileInputStream fis = new FileInputStream("1.txt");
		//��ʽ1
//		int data = 0;
//		while((data = fis.read())!=-1){//�����������һ���ֽ�һ���ֽڵĶ���ֱ���ļ�ĩβ(-1)
//			System.out.print((char)data);
//		}
		//��ʽ2
		byte[] bt = new byte[100];
		int len = fis.read(bt);//��ʾ�������ֽڳ���
		System.out.println(new String(bt,0,len));
		for(int i=0;i<len;i++){//�����while((data = fis.read())!=-1)������ͬ
			System.out.println(bt[i]);
		}
		System.out.println(len);
		System.out.write(bt,0,len);
	}
}
