package cys.gh.enum_method_3;

public class Method_valueOf_2 {

	/**
	 */
	public static void main(String[] args) {
		
		//将指定的字符串(此字符串必须是在枚举中应经定义的实例)转变成枚举类中的一个实例
		Color c = Color.valueOf("Blue");
		
		System.out.println(c);
	}

}
