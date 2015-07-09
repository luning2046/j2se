package cys.gh.date;

import java.util.Date;

public class TestDate1 {

	/*
	 * Date缺点：不能构建指定的时间的输出格式 ，且只有下面两种用法了，没有如光获得日期的月份的方法了 
	 */
	public static void main(String[] args) {
		//当前的时间
		Date d1 = new Date();
		System.out.println(d1);//输出的样式：Fri Jul 03 12:20:23 CST 2009
		System.out.println(d1.getTime());//获得 从1970年1月1日0分0秒起所经历的毫秒数
		
		//指定的时间（指定一个整数表示毫秒数，是指从1970年1月1日0分0秒起所经历的时间）
		//输出的样式 Thu Jan 01 08:00:02 CST 1970
		String l = "1370485620000";
		Date d2 = new Date(Long.parseLong(l));//等价于d2.setTime(Long.parseLong(l));
		System.out.println(System.currentTimeMillis());//获得 从1970年1月1日0分0秒起所经历的毫秒数
		System.out.println(d2);
	}
}
