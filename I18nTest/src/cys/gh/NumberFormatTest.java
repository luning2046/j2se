package cys.gh;

import java.text.NumberFormat;

public class NumberFormatTest {

	/**
	 * 数字格式化
	 */
	public static void main(String[] args) {
		double d = 1234.56;
		//数字格式化类
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1.format(d));//在本地样式格式化数字
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();//使用本地货币表示样式实例化NumberFormat类
		System.out.println(nf2.format(d));
		
	}
}
