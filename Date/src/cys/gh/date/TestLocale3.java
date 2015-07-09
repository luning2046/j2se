package cys.gh.date;

import java.util.Locale;

public class TestLocale3 {

	/*
	 * locale：获得本机的所在国家和语言的信息 
	 * 
	 */
	public static void main(String[] args) {
		//获得当前机器所在国家语言信息
		Locale defaultLocale = Locale.getDefault();
		
		System.out.println(defaultLocale);//zh_CN
		System.out.println(defaultLocale.getLanguage());//zh
		System.out.println(defaultLocale.getCountry());//CN
		System.out.println(defaultLocale.getDisplayLanguage());//中文(即是zh表示的文本显示)
		System.out.println(defaultLocale.getDisplayCountry());//中国(即是Cn表示的文本显示)
		
		//指定国家语言信息
		Locale l = new Locale("en","US");
	}

}
