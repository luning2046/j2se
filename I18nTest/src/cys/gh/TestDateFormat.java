package cys.gh;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	/**
	 * ���ڵĹ��ʻ�
	 * ���а��������ڹ��ҵ���ʽ��ʾ����
	 */
	public static void main(String[] args) {
		Date now = new Date();
		
		Locale locale = Locale.getDefault();//��ȡ���ع���������Ϣ
		System.out.println(locale);
		
		//���� ǰ����������������ʾ�Ĵ�С ��һ���ǰ�������ʽ��ʾ
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale);
		System.out.println(df.format(now));
		
	}

}
