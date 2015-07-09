package cys.gh;

import java.lang.reflect.Constructor;

/*
 * 通过反射创建一个实例对象（可以用不同的构造方法来创建）
 */
public class NewInstanceTest {

	public static void main(String[] args) throws Exception {
		Class clazz = User.class;
		Object obj = getObj(clazz);
		System.out.println(obj);
	}
	
	public static Object getObj(Class clazz) throws Exception{
//		//取得该类的所有构造方法
//		Constructor[] cons = clazz.getConstructors();
//		//遍历所有构造方法
//		for(Constructor c : cons){
//			//System.out.println(c.getName());取得这个构造方法的名字
//			Class[] cs = c.getParameterTypes();//取得这个构造方法的参数类型集合
//			for(Class clas:cs){//遍历这些参数类型
//				System.out.print("====="+clas.getName()+",");
//			}
//			System.out.println();
//		}
		Constructor cons = clazz.getConstructor(int.class,String.class);//得到指定参数的构造方法
		//通过这个构造方法创建一个实例（clazz.newInstance();用缺省的构造方法创建实例）
		Object obj = cons.newInstance(1,"cys");
		return obj;
	}
}

