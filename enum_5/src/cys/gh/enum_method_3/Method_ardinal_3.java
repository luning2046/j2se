package cys.gh.enum_method_3;

public class Method_ardinal_3 {

	/**
	 */
	public static void main(String[] args) {
		
		Color[] colors = Color.values();
		for(Color c : colors){
			System.out.print(c+" ");
			int order = c.ordinal();//此方法是返回枚举类中每个实例的位置
			System.out.println(order);
		}
		
	}

}
