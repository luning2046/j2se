package cys.gh.date;


import java.util.GregorianCalendar;

public class TestGregorianCalendar5 {

	/*
	 * TimeZone ：是Calendar的子类 提供了一个常用的方法判断是否是闰年的
	 * 
	 */
	public static void main(String[] args) {
		
		GregorianCalendar gg = new GregorianCalendar();
		
		System.out.println(gg.isLeapYear(2009));//2009年是不是闰年
		
	}

}
