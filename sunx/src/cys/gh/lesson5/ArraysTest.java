package cys.gh.lesson5;

import java.util.Arrays;

public class ArraysTest {

	/*
	 * System.arraycopy()数组的拷贝
	 * java.util.Arrays 对数组进行操作  如  排序  搜索
	 */
	public static void main(String[] args){
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[10];
		//数组的拷贝
		System.arraycopy(a1, 0, a2, 0, a1.length);
		for(int i=0;i<a2.length;i++){
			System.out.println(a2[i]);
		}
		Arrays.sort(a1);//对数组进行排序
		for(int i=0;i<a2.length;i++){
			System.out.println(a2[i]);
		}
	}	
}
