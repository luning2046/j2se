package cys.gh.lesson9;

import java.io.File;

/*
 * һ��File��Ķ��󣬱�ʾ�˴����ϵ��ļ���Ŀ¼
 * File���ṩ����ƽ̨�޹صķ������Դ����ϵ��ļ���Ŀ¼���в���
 */
public class File_1 {

	public static void main(String[] args) throws Exception{
//		File file = new File("d://w.txt");//����·������ʾ�ڵ�ǰ·����ָ��һ���ļ�,������
//		boolean b = file.exists();//
//		System.out.println(b);
		//file.createNewFile();
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write("aaabbb".getBytes());
//		fos.close();//��û�йر�ʱ��File��delete����������ִ�гɹ�
		File file2 = new File("d://cc//dd");//���·������ʾ�ڵ�ǰ·����ָ��һ��Ŀ¼���ļ��У�,������
		file2.mkdir();
//		
//		//�˷�ʽָ�����ļ����£�����ļ�d://bb�������Ѿ������ˣ�������һ���ļ�
//		File file3 = new File("d://bb","bb.txt");
//		file3.createNewFile();�����Ĵ��ļ���һ��û�д�С���ļ�����СΪ0byte��
//		
//		//��һ���Ѵ��ڵ�Ŀ¼�ļ���file2������һ���ļ�
//		File file4 = new File(file2,"2.txt");
//		file4.createNewFile();
//		
//		//�˷�ʽҲ��Ҫ·�����ֱ������Ѿ�������
//		File file5 = new File("d://cc//3.txt");
//		file5.createNewFile()
//		Thread.sleep(10000);
//		file.delete();//ɾ��ָ�����ļ�
	}
}









































