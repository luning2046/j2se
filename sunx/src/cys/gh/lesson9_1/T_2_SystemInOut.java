package cys.gh.lesson9_1;

public class T_2_SystemInOut {

	/**
	 * System类中的out 对象 就是一个向标准输出设备上输出的printStream（过滤流）类型
	 * System类中的in 对象 就是一个从标准输入设备输入的 inputStream 类型  
	 */
	//从标准输入设备键盘中输入内容，再标准输出设备屏幕上输出
	public static void main(String[] args) throws Exception{
		int data;
		while((data=System.in.read())!=-1){
			System.out.write(data);
		}
		
	}
	/*
	 * 比如：在命令行下运行此程序情形
	 * 输入 a  按回车
	 * 输出 97   //字符a的ASIIC码
	 * 输出 13   //回车的ASIIC码
	 * 输出 10   //换行的ASIIC码
	 * 
	 * 
	 * 当输入中文时  会输出问号‘？’
	 */

}
