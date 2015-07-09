package cys.gh.lesson9;

import java.io.File;

/*
 * 文件的删除
 */
public class File_2 {

	public static void main(String[] args) {
		File f1 = new File("d:\\11_n.jpg");
		f1.delete();//删除这个文件
		
//		File f2 = new File("c:\\aa\\cc.txt");
//		f2.createNewFile();
//		//当程序执行完毕（退出jvm）时，将指定的文件删除，用于创建一个临时文件
//		f2.deleteOnExit();
//		Thread.sleep(3000);
//		
//		/*
//		 * 创建临时文件，参数1表示临时文件名，参数2临时文件扩展名（必须的）
//		 * 临时文件保存在操作系统的一个特定目录下，这个目录在环境变量中指定的
//		 */
//		File f3 = File.createTempFile("cys",".tmp");
//		f3.deleteOnExit();//将临时文件在程序退出时，自动删除
//		
//		File f4 = new File("c:\\aa");
//		String[] fnames = f4.list();//列出指定目录下的文件名及子目录名
	}
}
