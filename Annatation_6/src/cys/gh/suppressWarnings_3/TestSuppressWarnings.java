package cys.gh.suppressWarnings_3;

import java.util.Date;

/*
 * SuppressWarning:可以关闭编译器对指定的一种或多种问题
 * 的提示或警告功能
 */
@SuppressWarnings(value={"deprecation"})//表示关闭对使用过时方法的警告
public class TestSuppressWarnings {
	public static void main(String[] args){
		Date d = new Date();
		//使用过时方法
		int hour = d.getHours();
		System.out.println(hour);
	}
}
