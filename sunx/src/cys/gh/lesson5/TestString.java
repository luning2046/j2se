package cys.gh.lesson5;

public class TestString {

	public static void main(String[] args) {
		
		test1();
	}

	private static void test1() {
		//字符串一旦被初始化，就不能改变（指的是如下代码中的“aaa”不能改变，不是引用变量s（s可以改变））。
		String s = "aaa";//aaa存储在字符串常量池中。
		String s1 = "aaa";
		System.out.println(s==s1);//值true，因为jvm创建一个字符串时，将此字符串存储在字符串常量池中
								//当在次创建一个新字符串时，首先在字符串常量池中查找有没有与此新字符串equals的字符串常量
								//有，则直接指向此常量引用即可
	}
	private static void test2() {
		String s = "aaa";
		String s1 = new String("aaa");
		System.out.println(s==s1);//值false，因为s指向的字符串是存储在字符串常量池中
										//s1指向的对象在堆内存中创建的对象，其初始值为aaa
	}
}
