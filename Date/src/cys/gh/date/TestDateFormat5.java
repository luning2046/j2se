package cys.gh.date;

import java.text.DateFormat;
import java.util.Date;

public class TestDateFormat5 {

	/*
	 * DateFormat:ʹ�����е���ʽ ��ʽ������ �������ò�ͬ��ʽ��ʾ���ڣ������Զ�����ʽ
	 */
	public static void main(String[] args) {
		
		//ָ�����ɵĶ���
		//Ĭ�ϸ�ʽ
		DateFormat df1 = DateFormat.getDateTimeInstance();//���ں�ʱ�䶼���и�ʽ��
		//DateFormat.getTimeInstance() ��ʱ���ʽ��
		df1.format(new Date());
		System.out.println(df1.format(new Date()));//2009-7-3 14:09:59
		
		
		
		//ָ����ʽ
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		df2.format(new Date());//Ĭ�ϸ�ʽ
		System.out.println(df2.format(new Date()));//09-7-3 ����2:09
		
	}

}
