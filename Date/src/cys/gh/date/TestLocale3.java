package cys.gh.date;

import java.util.Locale;

public class TestLocale3 {

	/*
	 * locale����ñ��������ڹ��Һ����Ե���Ϣ 
	 * 
	 */
	public static void main(String[] args) {
		//��õ�ǰ�������ڹ���������Ϣ
		Locale defaultLocale = Locale.getDefault();
		
		System.out.println(defaultLocale);//zh_CN
		System.out.println(defaultLocale.getLanguage());//zh
		System.out.println(defaultLocale.getCountry());//CN
		System.out.println(defaultLocale.getDisplayLanguage());//����(����zh��ʾ���ı���ʾ)
		System.out.println(defaultLocale.getDisplayCountry());//�й�(����Cn��ʾ���ı���ʾ)
		
		//ָ������������Ϣ
		Locale l = new Locale("en","US");
	}

}
