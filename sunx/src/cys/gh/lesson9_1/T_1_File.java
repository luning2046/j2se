package cys.gh.lesson9_1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class T_1_File {

	public static void main(String[] args) throws IOException{
		
		
		
		//查看指定目录下的所有文件或文件夹
		File f6=new File("D:\\workspace\\");
		
		
		System.out.println(f6.length());//取得指定文件的长度
		
		
		String[] fl = f6.list();
		for(int i=0;i<fl.length;i++){
			System.out.println(fl[i]);
		}
		
		//查看文件夹的指定文件的
		//（如 光查看D:\\workspace文件夹下的后缀名为".java"的文件）
		//此时用到list(FilenameFilter ff);方法  指定一个多虑器
		File f7=new File("D:\\workspace\\");
		String[] fl1 = f6.list(new FilenameFilter(){//这个过滤器用匿名内部类实现

			public boolean accept(File f7, String name) {
				//含后缀名.java的文件，显示出来
				return name.indexOf(".txt")!=-1;
			}
			
		});
		for(int i=0;i<fl1.length;i++){
			System.out.println(fl1[i]);
		}
	}
}
