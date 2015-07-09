package cys.gh.zxx;

import java.lang.reflect.Field;

public class TestField_3 {

	public static void main(String[] args)throws Exception {
		
		ReflectPoint rp = new ReflectPoint(5,6);
		Field f_y = rp.getClass().getField("y");//取得名为"y"的属性，不能取private的属性
		
		//f_y的值是多少？是6，错!f_y不是对象身上的变量而是类上的，要取得某个变量的值必须指定一个对象
		System.out.println(f_y.get(rp));//取指定对象的属性值
	
		Field f_x = rp.getClass().getDeclaredField("x");//取private的属性
		//因为此属性的private的所以不能用上面的方式取得它指定对象的属性值
		f_x.setAccessible(true);//通过此语句就可访问这个值了
		System.out.println(f_x.get(rp));
		
		System.out.println(f_y.getType());//取属性f_y的类型
		
	}
}

class ReflectPoint{
	private int x;
	public int y;
	
	public ReflectPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
}