package cys.gh.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat6 {

	/*
	 * 自定义样式 进行格式化日期
	 */
	public static void main(String[] args) {
		
		
		//yyyy-MM-dd HH:mm:ss 用指定的格式将日期类型转为字符串类型
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		
		String d2 = sdf.format(new Date());

		System.out.println(d2);

		try {
			//解析字符串 将字符串 解析为日期类型
			Date d = sdf.parse("2009年03月12日");
			System.out.println(d);//Thu Mar 12 00:00:00 CST 2009
			
			//******************************************************
			System.out.println(d.getTime());//得到日期的毫秒数
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
