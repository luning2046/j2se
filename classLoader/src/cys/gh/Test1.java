package cys.gh;

public class Test1 {

	/*
	 * 本例得到AppClassLoader类加载器
	 */
	public static void main(String[] args){
		//得到Test类的类加载器  类加载器也是一个类
		ClassLoader cl = Test1.class.getClassLoader();
		System.out.println(cl.getClass().getName());//得到这个类加载器的名称
	}
}
