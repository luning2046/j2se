package cys.gh.enum_method_3;

public class Method_ardinal_3 {

	/**
	 */
	public static void main(String[] args) {
		
		Color[] colors = Color.values();
		for(Color c : colors){
			System.out.print(c+" ");
			int order = c.ordinal();//�˷����Ƿ���ö������ÿ��ʵ����λ��
			System.out.println(order);
		}
		
	}

}
