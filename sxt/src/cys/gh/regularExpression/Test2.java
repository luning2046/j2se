package cys.gh.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args){
		//这个类将系统提供的正则表达式进行编译，此类在帮助文档中列出了
		//正则表达式的样式 三个所有小写字母
		Pattern p = Pattern.compile("\\d{3,5}");
		String s = "123-33445-324-00";
		//参数字符是否符合正则表达式，返回结果封装到Matcher类
		Matcher m=p.matcher(s);
		m.matches();//表示m是否匹配指定的正则表达式
		m.find();//能否找到一个与指定正则表达式匹配的子串 返回boolean
		
		System.out.println(m.matches());
	}
}
