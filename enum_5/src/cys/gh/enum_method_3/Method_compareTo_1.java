package cys.gh.enum_method_3;

public class Method_compareTo_1 {

	public static void main(String[] args) {
		enumCompareTo(Color.Blue);
	}
	/*
	 * enum类有一个方法compareTo（enum e）表示(比较对象的位置)
	 * 当前enum对象与指定enum对象进行比较 是比较的枚举对象在枚举类中的先对位置
	 * 如 Color中Red,White,Blue;red属于1，White属于2，Blue属于3
	 */
	public static void enumCompareTo(Color color){
		Color[] colors = Color.values();
		for(Color c : colors){
			int intValue = color.compareTo(c);
			System.out.println(intValue+","+c);
		}
	}

}
