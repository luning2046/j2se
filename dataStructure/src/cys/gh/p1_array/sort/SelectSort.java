package cys.gh.p1_array.sort;

public class SelectSort {

	/**
	 * —°‘Ò≈≈–Ú
	 */
	public static void main(String[] args) {
		int[] a = { 3, 7, 1, 2, 6, 4, 5, 10 };
		sort2(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
	private static void sort1(int[] a){
		int len = a.length;

		int index = 0;
		int min = a[0];

		for (int i = 0; i < len; i++) {
			index = i;
			min = a[i];
			for (int j = i; j < len; j++) {
				if (min > a[j]) {
					min = a[j];
					index = j;
				}
			}
			if (i != index) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}
	}

	private static void sort2(int[] a){
		int len = a.length;
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

