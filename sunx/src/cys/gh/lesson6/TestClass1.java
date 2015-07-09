package cys.gh.lesson6;
/*
 * 每个编译完成的class字节码文件 都产生一个Class对象 用于
 * 表示这个类的类型信息
 */
public class TestClass1 {

	public static void main(String[] args) throws Exception{
		User user = new User();
		Integer i = new Integer(4);
		/*
		 * Class的以getName方法 
		 * 以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
		 */
		
		//此种方式不知道类名的情况下，指定一个字符串，加载一个类到内存中
		Class clazz1 = Class.forName("cys.gh.sunxin.lesson6.User");
		System.out.println(clazz1.getName());//输出值：cys.gh.sunxin.lesson6.User
		System.out.println(clazz1);//输出值：class cys.gh.sunxin.lesson6.User
		
		
		//对象名已知
		Class clazz2 = user.getClass();//通过对象获得Class对象
		System.out.println(clazz2.getName());
		
		
		//类名已知
		Class clazz3 = User.class;//通过类名获得Class对象
		System.out.println(clazz3.getName());
		
		
		Class clazz4 = i.TYPE;//对于基本数据类型的封装类 可以通过TYPE获得 Class 对象
		System.out.println(clazz4.getName());//返回的类型是基本数据类型 不是封装类型
	
	}
}
