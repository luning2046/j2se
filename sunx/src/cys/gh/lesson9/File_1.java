package cys.gh.lesson9;

import java.io.File;

/*
 * 一个File类的对象，表示了磁盘上的文件或目录
 * File类提供了与平台无关的方法来对磁盘上的文件或目录进行操作
 */
public class File_1 {

	public static void main(String[] args) throws Exception{
//		File file = new File("d://w.txt");//绝对路径，表示在当前路径下指定一个文件,并创建
//		boolean b = file.exists();//
//		System.out.println(b);
		//file.createNewFile();
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write("aaabbb".getBytes());
//		fos.close();//流没有关闭时，File的delete方法，不能执行成功
		File file2 = new File("d://cc//dd");//相对路径，表示在当前路径下指定一个目录（文件夹）,并创建
		file2.mkdir();
//		
//		//此方式指定的文件夹下（这个文件d://bb必须是已经存在了），创建一个文件
//		File file3 = new File("d://bb","bb.txt");
//		file3.createNewFile();创建的此文件是一个没有大小的文件（大小为0byte）
//		
//		//用一个已存在的目录文件（file2）创建一个文件
//		File file4 = new File(file2,"2.txt");
//		file4.createNewFile();
//		
//		//此方式也需要路径部分必须是已经存在了
//		File file5 = new File("d://cc//3.txt");
//		file5.createNewFile()
//		Thread.sleep(10000);
//		file.delete();//删除指定的文件
	}
}









































