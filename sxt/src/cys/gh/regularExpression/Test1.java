package cys.gh.regularExpression;

public class Test1 {

	public static void main(String[] args) {
		/*boolean matches(String regex)
		 * 参数：是一个正则表达式
		 * 功能：一个字符串是否匹配参数中正则表达式的格式
		 */
		//"..."就是正则表达式的一种。一个点代表一个字母，三个点代表三个字母
		boolean b1="abc".matches("...");
		/*
		 * "\d"正则表达式，表示一个数字
		 * 此方法功能是：将字符串中所有数字，替换为”-“
		 */
		String s1 = "a3984a".replaceAll("\\d","-");
		System.out.println(b1);
		System.out.println(s1);
		
		//认识. * +
		"a".matches(".");//.代表一个字母
		"aa".matches("aa");//这个就是一般的字符匹配
		"aaaa".matches("a*");//*代表0次或多次 a*表示 匹配a出现0次或多次
		"aaaa".matches("a+");//+代表一个或多个
		"".matches("a*");
		"aaaa".matches("a?");//？表示0个或1个
		"".matches("a?");//"aaaa".matches("a*");
		//x{n}表示字符x正好出现n次
		//x{n,}表示字符x出现n次到无限次
		//x{n,m}表示字符x出现n次到m次
		"1235436436".matches("\\d{3,100}");//数字是否出现3到100次
		/*\\d 即是\d表示数字
		 * \\.是转移字符代表”.“（在正则表达式中"."是一个元数据表示一个字母）
		 * 					而要在正则表达式中出现一个真正的"."号则要转义用"\\."来表示
		 * 此语句意思每一个"."前面是否匹配1到3个数字
		 */
		"192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\");
		//表示每位数字是否在指定范围中
		"192".matches("[0-2][0-9][0-9]");
		
		//范围
		
		"a".matches("[abc]");//表示是否在这三个字符存在
		"a".matches("[^abc]");//表示是除了这个三个字符之外的
		
		//这三个意思一样"A"是否在a-z或A-Z之间
		"A".matches("[a-zA-Z]");
		"A".matches("[a-z]|[A-Z]");
		"A".matches("[a-z[A-Z]]");
		//表示是否在A-Z之间 且是RFG之一
		"P".matches("[A-Z&&[RFG]]");
		
		/*认识 \s是否是空白字符,\S不是空白字符
		 * \w表示[a-zA-Z_0-9]表示是否是这里名允许的字符
		 * \d表示是否是数字
		 * 
		 */
	}

}
















