package cys.gh.enum_simpledemo_1;

public class TestEnumColor {

	public static void main(String[] args){
		//相当于color引用指向枚举实例Red
		Color color = Color.Red;
		System.out.println(color);
		
		/*
		 * values是枚举类的方法：是将枚举实例
		 * 封装成一个数组返回此数组
		 */
		Color[] cArray = Color.values();
		for(Color c : cArray){
			System.out.println(c);
		}
	}
}
