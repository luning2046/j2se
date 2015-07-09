package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestFieldDemo_4_2 {

	public static void main(String[] args)throws Exception{
		User u = new User();
		chanageStringValue(u);
		System.out.println(u);
	}
	
	//�޸Ķ�����name���Ե�ֵ
	private static void chanageStringValue(Object obj)throws Exception{
		Class cls = obj.getClass();
		Field[] fs = cls.getFields();
		for(Field f : fs){
			if(f.getType()==String.class){
				String s = (String)f.get(obj);//ȡ��������Զ�Ӧ��ֵ
				String s_n = s.replace("s","y");//�޸ĺ���ַ���
				f.set(obj,s_n);//��������������µ�ֵ
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
