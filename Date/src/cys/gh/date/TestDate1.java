package cys.gh.date;

import java.util.Date;

public class TestDate1 {

	/*
	 * Dateȱ�㣺���ܹ���ָ����ʱ��������ʽ ����ֻ�����������÷��ˣ�û����������ڵ��·ݵķ����� 
	 */
	public static void main(String[] args) {
		//��ǰ��ʱ��
		Date d1 = new Date();
		System.out.println(d1);//�������ʽ��Fri Jul 03 12:20:23 CST 2009
		System.out.println(d1.getTime());//��� ��1970��1��1��0��0�����������ĺ�����
		
		//ָ����ʱ�䣨ָ��һ��������ʾ����������ָ��1970��1��1��0��0������������ʱ�䣩
		//�������ʽ Thu Jan 01 08:00:02 CST 1970
		String l = "1370485620000";
		Date d2 = new Date(Long.parseLong(l));//�ȼ���d2.setTime(Long.parseLong(l));
		System.out.println(System.currentTimeMillis());//��� ��1970��1��1��0��0�����������ĺ�����
		System.out.println(d2);
	}
}
