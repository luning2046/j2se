package cys.gh;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	/**
	 * 日期的国际化
	 * 此列按本机所在国家的样式显示日期
	 */
	public static void main(String[] args) {
		Date now = new Date();
		
		Locale locale = Locale.getDefault();//获取本地国家语言信息
		System.out.println(locale);
		
		//参数 前两个是设置日期显示的大小 后一个是按本地样式显示
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale);
		System.out.println(df.format(now));
		
	}

}
