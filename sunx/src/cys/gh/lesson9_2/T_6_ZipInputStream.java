package cys.gh.lesson9_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * ѹ���ļ� �����ļ�����Ϊ.zip��ʽ��ѹ���ļ�
 * �����ǽ�  cys.gh.lesson9_2�˰��µ�a.txt��b.txt
 * �������ļ� ���Ϊһ��zip��ʽ���ļ�
 */
public class T_6_ZipInputStream {
	
	public static void main(String[] args) throws Exception{
		File f1 = new File("1.txt");
		byte[] b1 = new byte[(int)f1.length()];
		FileInputStream fis1 = new FileInputStream(f1);
		fis1.read(b1);
		fis1.close();
		
		File f2 = new File("2.txt");
		byte[] b2 = new byte[(int)f2.length()];
		FileInputStream fis2 = new FileInputStream(f2);
		fis2.read(b2);
		fis2.close();
		//===========================
		FileOutputStream fos = new FileOutputStream("c://xx.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		zos.putNextEntry(new ZipEntry("a.txt"));//��ѹ����xx.zip�� ����һ���ļ�a.txt
		zos.write(b1);//��b1�����ݷ���a.txt�ļ���
		zos.closeEntry();
		
		zos.putNextEntry(new ZipEntry("d/b.txt"));//��ѹ����xx.zip�� ����һ����Ŀ¼�ṹ���ļ�"d/b.txt"
		zos.write(b2);
		zos.closeEntry();
		
		//��ѹ����xx.zip�� ����һ�����ļ��� �ַ�����ǰ�����ļ����� ����б�ܱ������
		zos.putNextEntry(new ZipEntry("ccc/"));
		zos.closeEntry();
		
		zos.close();
	}
}
