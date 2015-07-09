package cys.gh.lesson9_2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * 压缩文件 ，将文件保存为.zip格式的压缩文件
 * 本例是将  cys.gh.lesson9_2此包下的a.txt和b.txt
 * 这两个文件 打包为一个zip格式的文件
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
		
		zos.putNextEntry(new ZipEntry("a.txt"));//在压缩包xx.zip中 生成一个文件a.txt
		zos.write(b1);//将b1的内容放入a.txt文件中
		zos.closeEntry();
		
		zos.putNextEntry(new ZipEntry("d/b.txt"));//在压缩包xx.zip中 生成一个有目录结构的文件"d/b.txt"
		zos.write(b2);
		zos.closeEntry();
		
		//在压缩包xx.zip中 生成一个空文件夹 字符串中前面是文件夹名 后面斜杠必须存在
		zos.putNextEntry(new ZipEntry("ccc/"));
		zos.closeEntry();
		
		zos.close();
	}
}
