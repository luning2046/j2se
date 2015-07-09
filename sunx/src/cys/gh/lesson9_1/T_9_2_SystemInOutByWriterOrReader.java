package cys.gh.lesson9_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T_9_2_SystemInOutByWriterOrReader {

	/**
	 * System类中的out 对象 就是一个向标准输出设备上输出的printStream（过滤流）类型
	 * System类中的in 对象 就是一个从标准输入设备输入的 inputStream 类型  
	 */
	public static void main(String[] args) throws Exception{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		while(!"exit".equals(str)){
			System.out.println(str);
			str = br.readLine();
		}
	}
}
