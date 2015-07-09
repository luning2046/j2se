package cys.gh.zxx;

public class TestBasic_1 {

	/**
	 * Class基本的应用
	 * 只要在源程序中出现的类型，都有各自的Class实例对象，如 int[]，void
	 * 							都可以得到对应的字节码  Class clz=void.class;
	 * 												Class clz=int[].class;
	 */
	public static void main(String[] args) throws Exception{
		
		String str = "abc";
		Class cls1 = str.getClass();//通过对象获得Class
		Class cls2 = String.class;//通过类获得Class
		Class cls3 = Class.forName("java.lang.String");//在"运行期"加载一个类，并将这个类编译成字节码赋给Class
		System.out.println(cls1==cls2);//true 因为都是指向同一个String的Class类型
		System.out.println(cls1==cls3);//true 因为都是指向同一个String的Class类型
		
		System.out.println(cls1.isPrimitive());//判断是否基本数据类型 false
		System.out.println(int.class.isPrimitive());//是基本数据类型true
		System.out.println(int.class == Integer.class);//false一个是基本数据类型 一个是包装类型
		System.out.println(int.class==Integer.TYPE);//Integer.TYPE表示取得包装类型的对应基本数据类型 所以true
		System.out.println(int[].class.isArray());//true 判断是否数组

	}
}
