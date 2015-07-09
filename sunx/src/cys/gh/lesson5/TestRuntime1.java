package cys.gh.lesson5;

import java.io.IOException;

public class TestRuntime1 {

	/**
	 *每一个java程序都有一个Runtime类的单一实例的意思是：
		就是每一个独立运行的java项目（有一个main入口函数）都存在一个Runtime类
		这个类的作用是：可以与这个java项目所在的运行环境jvm 进行交互，即它能访问运行环境
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());//获得jvm的自由内存
		System.out.println(rt.totalMemory());//获得jvm的总的内存
		rt.exec("notepad");//执行一个外部程序，作为当前进程的子进程
		//rt.exec("javac aa.java"); 执行一个编译一个类的命令
		System.out.println("aaaaaaaaaaaaaaaaaaa");

	}

}
