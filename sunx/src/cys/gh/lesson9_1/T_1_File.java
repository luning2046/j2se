package cys.gh.lesson9_1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class T_1_File {

	public static void main(String[] args) throws IOException{
		
		
		
		//�鿴ָ��Ŀ¼�µ������ļ����ļ���
		File f6=new File("D:\\workspace\\");
		
		
		System.out.println(f6.length());//ȡ��ָ���ļ��ĳ���
		
		
		String[] fl = f6.list();
		for(int i=0;i<fl.length;i++){
			System.out.println(fl[i]);
		}
		
		//�鿴�ļ��е�ָ���ļ���
		//���� ��鿴D:\\workspace�ļ����µĺ�׺��Ϊ".java"���ļ���
		//��ʱ�õ�list(FilenameFilter ff);����  ָ��һ��������
		File f7=new File("D:\\workspace\\");
		String[] fl1 = f6.list(new FilenameFilter(){//����������������ڲ���ʵ��

			public boolean accept(File f7, String name) {
				//����׺��.java���ļ�����ʾ����
				return name.indexOf(".txt")!=-1;
			}
			
		});
		for(int i=0;i<fl1.length;i++){
			System.out.println(fl1[i]);
		}
	}
}
