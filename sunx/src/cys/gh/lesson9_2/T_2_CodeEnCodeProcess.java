package cys.gh.lesson9_2;

import java.io.IOException;

/*
 * java��xpƽ̨֮��������Ĺ�������
 */
public class T_2_CodeEnCodeProcess {

	/**
	 * jvmĬ�ϱ��뷽ʽ��GBK
	 * 
	 */
	public static void main(String[] args) throws IOException {

		String str = "�й�";//�����ʱ������ַ�����ʱ��  ���˱��浽jvmʱ Ϊunicode����
		
		//�����ʱ�򣬽�����ַ������й�����Unicode��ֵ��Ĭ�ϵ���GBK����
		System.out.println(str.getBytes("gbk").length+"---"+new String(str.getBytes("gbk"),"gbk"));
		
		//�����ʱ�򣬽�����ַ������й�����Unicode��ֵ��Ĭ�ϵ���utf-8����
		System.out.println(str.getBytes("utf-8").length+"---"+new String(str.getBytes("gbk"),"utf-8"));

		//�����ʱ�򣬽�����ַ������й�����Unicode��ֵ��Ĭ�ϵ���ISO-8859-1����
		System.out.println(str.getBytes("ISO-8859-1").length+"---"+new String(str.getBytes("gbk"),"ISO-8859-1"));
	}
}
