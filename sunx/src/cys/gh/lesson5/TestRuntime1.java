package cys.gh.lesson5;

import java.io.IOException;

public class TestRuntime1 {

	/**
	 *ÿһ��java������һ��Runtime��ĵ�һʵ������˼�ǣ�
		����ÿһ���������е�java��Ŀ����һ��main��ں�����������һ��Runtime��
		�����������ǣ����������java��Ŀ���ڵ����л���jvm ���н����������ܷ������л���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());//���jvm�������ڴ�
		System.out.println(rt.totalMemory());//���jvm���ܵ��ڴ�
		rt.exec("notepad");//ִ��һ���ⲿ������Ϊ��ǰ���̵��ӽ���
		//rt.exec("javac aa.java"); ִ��һ������һ���������
		System.out.println("aaaaaaaaaaaaaaaaaaa");

	}

}
