package cys.gh;

public class Test2 {

	/*
	 * java虚拟机默认的 类加载器有；
	 *  	BootStrap		        加载JRE/LIB/rt.jar   它是所有类的终极加载器  不是一个java类 这点特殊
	 *  	ExtClassLoader	        加载JRE/lib/ext/*.jar	
	 *  	AppClassLoader     加载ClassPath指定的所有jar或目录
	 *  这些类加载器是 树状结构的关系
	 *  
	 */
	public static void main(String[] args){
		//得到Test类的类加载器  类加载器也是一个类
		ClassLoader cl = Test2.class.getClassLoader();
		while(cl!=null){
			System.out.println(cl.getClass().getName());//得到这个类加载器的名称
			cl = cl.getParent();
		}
		System.out.println(cl);
	}
}
