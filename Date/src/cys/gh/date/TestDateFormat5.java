package cys.gh.date;

import java.text.DateFormat;
import java.util.Date;

public class TestDateFormat5 {

	/*
	 * DateFormat:使用它有的样式 格式化日期 （可以用不同样式显示日期）不能自定义样式
	 */
	public static void main(String[] args) {
		
		//指定生成的对象
		//默认格式
		DateFormat df1 = DateFormat.getDateTimeInstance();//日期和时间都进行格式化
		//DateFormat.getTimeInstance() 光时间格式化
		df1.format(new Date());
		System.out.println(df1.format(new Date()));//2009-7-3 14:09:59
		
		
		
		//指定样式
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		df2.format(new Date());//默认格式
		System.out.println(df2.format(new Date()));//09-7-3 下午2:09
		
	}

}
