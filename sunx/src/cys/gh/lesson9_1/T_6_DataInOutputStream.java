package cys.gh.lesson9_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ���������ṩ�˶�дjava�еĻ����������͵Ĺ���
 */
public class T_6_DataInOutputStream {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		int i=2;
		byte b = 5;
		boolean bool = true;
		double d = 1.245;
		//��txt�ļ��ϣ�������ļ�ʱ�϶�������  �����뷽ʽ��ͬ
		dos.writeInt(i);//������ļ���  ռ4���ֽ�
		dos.writeByte(b);//������ļ���  ռ1���ֽ�
		dos.writeBoolean(bool);//������ļ���  ռ1���ֽ�
		dos.writeDouble(d);//������ļ���  ռ8���ֽ�
		dos.close();
		
		//����˳��Ҫ��д��˳��һ��
		FileInputStream fis = new FileInputStream("1.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		dis.close();
	}
}
