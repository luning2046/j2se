package cys.gh.lesson5;

import java.io.IOException;
import java.io.InputStream;

public class TestRuntime2 {

	public static void main(String[] args) throws IOException{
		
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("java AA");//Process p������ ִ�����AA�����һ���ӽ���
		//������ӽ��̵Ľ������������ʽ���
		InputStream is = p.getInputStream();
		int data;
		while((data=is.read())!=-1){
			System.out.println((char)data);
		}
	}
}
class AA{
	public static void main(String[] args) {
		System.out.println("======================AA===================");
	}
}