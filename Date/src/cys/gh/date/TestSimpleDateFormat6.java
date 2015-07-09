package cys.gh.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat6 {

	/*
	 * �Զ�����ʽ ���и�ʽ������
	 */
	public static void main(String[] args) {
		
		
		//yyyy-MM-dd HH:mm:ss ��ָ���ĸ�ʽ����������תΪ�ַ�������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		
		String d2 = sdf.format(new Date());

		System.out.println(d2);

		try {
			//�����ַ��� ���ַ��� ����Ϊ��������
			Date d = sdf.parse("2009��03��12��");
			System.out.println(d);//Thu Mar 12 00:00:00 CST 2009
			
			//******************************************************
			System.out.println(d.getTime());//�õ����ڵĺ�����
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
