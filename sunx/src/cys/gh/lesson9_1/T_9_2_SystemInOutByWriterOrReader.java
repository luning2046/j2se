package cys.gh.lesson9_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T_9_2_SystemInOutByWriterOrReader {

	/**
	 * System���е�out ���� ����һ�����׼����豸�������printStream��������������
	 * System���е�in ���� ����һ���ӱ�׼�����豸����� inputStream ����  
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
