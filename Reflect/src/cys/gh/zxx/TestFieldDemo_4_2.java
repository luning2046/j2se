package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestFieldDemo_4_2 {

	public static void main(String[] args)throws Exception{
		User u = new User();
		chanageStringValue(u);
		System.out.println(u);
	}
	
	//修改对象中name属性的值
	private static void chanageStringValue(Object obj)throws Exception{
		Class cls = obj.getClass();
		Field[] fs = cls.getFields();
		for(Field f : fs){
			if(f.getType()==String.class){
				String s = (String)f.get(obj);//取得这个属性对应的值
				String s_n = s.replace("s","y");//修改后的字符串
				f.set(obj,s_n);//给这个属性设置新的值
			}
		}
	}
	
}

class User{
	public String name="cys";
	public int age = 11;
	
	public String toString(){
		return "name="+name;
	}
}
