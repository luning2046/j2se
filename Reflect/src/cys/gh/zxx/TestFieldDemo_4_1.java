package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestFieldDemo_4_1 {

	public static void main(String[] args){
		String str = "ball";
		chanageStringValue(str);
	}
	//修改字符串的值
	private static void chanageStringValue(Object obj) {
		//如果传递过来的参数是一个String类型，通过obj.getClass()怎么就能得到真正的String类型的
		//字节码呢？（根据多态原理因为每一个指定的类型的getClass方法都重写了这个getClass方法，所以根据
		//子类对象重写了父类的方法，而用父类对象调用这个重写的方法时，实际上就是调用的子类的这个方法）
		//所以本例中实际上就得到了传递过来参数的类型的class类型
		Class cls = obj.getClass();//如果传递过来的是String类型，通过这句就得到了String的Class类型
		System.out.println(cls);//class java.lang.String
		System.out.println(String.class);//class java.lang.String
	}
}
