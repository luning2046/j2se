package cys.gh.enum_simpledemo_1;

public class TestEnumColor {

	public static void main(String[] args){
		//�൱��color����ָ��ö��ʵ��Red
		Color color = Color.Red;
		System.out.println(color);
		
		/*
		 * values��ö����ķ������ǽ�ö��ʵ��
		 * ��װ��һ�����鷵�ش�����
		 */
		Color[] cArray = Color.values();
		for(Color c : cArray){
			System.out.println(c);
		}
	}
}
