package cys.gh.lesson9;

import java.io.File;

/*
 * �ļ���ɾ��
 */
public class File_2 {

	public static void main(String[] args) {
		File f1 = new File("d:\\11_n.jpg");
		f1.delete();//ɾ������ļ�
		
//		File f2 = new File("c:\\aa\\cc.txt");
//		f2.createNewFile();
//		//������ִ����ϣ��˳�jvm��ʱ����ָ�����ļ�ɾ�������ڴ���һ����ʱ�ļ�
//		f2.deleteOnExit();
//		Thread.sleep(3000);
//		
//		/*
//		 * ������ʱ�ļ�������1��ʾ��ʱ�ļ���������2��ʱ�ļ���չ��������ģ�
//		 * ��ʱ�ļ������ڲ���ϵͳ��һ���ض�Ŀ¼�£����Ŀ¼�ڻ���������ָ����
//		 */
//		File f3 = File.createTempFile("cys",".tmp");
//		f3.deleteOnExit();//����ʱ�ļ��ڳ����˳�ʱ���Զ�ɾ��
//		
//		File f4 = new File("c:\\aa");
//		String[] fnames = f4.list();//�г�ָ��Ŀ¼�µ��ļ�������Ŀ¼��
	}
}
