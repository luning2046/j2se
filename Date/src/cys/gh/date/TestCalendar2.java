package cys.gh.date;

import java.util.Calendar;


public class TestCalendar2 {

	/*
	 * Calendar：1获得指定日期的月份等的方法了 
	 * 			 2能进行日期的运算（如过了几年是哪一年等等）
	 * 
	 */
	public static void main(String[] args) throws Exception {
		//这种方式定义一个方法 ，获取当前时间
		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1);
//		c1.add(Calendar.YEAR,10);//今年过了10年是哪一年
//		c1.add(Calendar.DAY_OF_WEEK,3);//三天后
		
		
		System.out.println(c1.get(Calendar.YEAR));//获取年
		System.out.println(c1.get(Calendar.MONTH));//获取月（注意月0表示一月...）
		System.out.println(c1.get(Calendar.DATE));//获取日期
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));//获取时
		System.out.println(c1.get(Calendar.MINUTE));//获取分
		System.out.println(c1.get(Calendar.SECOND));//获取秒
		System.out.println(c1.get(Calendar.AM_PM));//是上午还是下午 上午返回0下午返回1
		
		System.out.println(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));//是这个月的第几周
		System.out.println("--"+c1.get(Calendar.DAY_OF_WEEK));//是这周的第几天
//		c1.set(2001,5,2);//指定一个日期
//		
//		System.out.println("====="+dayForWeek(""));
//		c1.setTimeInMillis(System.currentTimeMillis());
//		System.out.println(c1);
		
//		   Calendar c = Calendar.getInstance();
//         c.set(Calendar.HOUR_OF_DAY, 5);//只是把当前日期的  “时”设置为5点
//         c.set(Calendar.MINUTE, 34);//只是把当前日期的  “分”设置为34分  其他时间字段不变  如  年，月
System.out.println("--"+(c1.get(Calendar.DAY_OF_WEEK)+5)%7);//是这周的第几天
		
	}
	
	public static int dayForWeek(String pTime) throws Exception {  
		 Calendar c = Calendar.getInstance();  
//		 c.setTime(format.parse(pTime));  
		 int dayForWeek = 0;  
		 if(c.get(Calendar.DAY_OF_WEEK) == 1){  
		  dayForWeek = 7;  
		 }else{  
		  dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;  
		 }  
		 return dayForWeek;  
	} 
}