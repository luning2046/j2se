package cys.gh.enum_method_3;

public class Method_compareTo_1 {

	public static void main(String[] args) {
		enumCompareTo(Color.Blue);
	}
	/*
	 * enum����һ������compareTo��enum e����ʾ(�Ƚ϶����λ��)
	 * ��ǰenum������ָ��enum������бȽ� �ǱȽϵ�ö�ٶ�����ö�����е��ȶ�λ��
	 * �� Color��Red,White,Blue;red����1��White����2��Blue����3
	 */
	public static void enumCompareTo(Color color){
		Color[] colors = Color.values();
		for(Color c : colors){
			int intValue = color.compareTo(c);
			System.out.println(intValue+","+c);
		}
	}

}
