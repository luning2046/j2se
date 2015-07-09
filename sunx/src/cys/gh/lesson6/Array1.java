package cys.gh.lesson6;

import java.util.Arrays;

/*数组元素是基本数据类型的排序 （都默认实现了compareable接口）
 * System.arraycopy 方法 数组的拷贝
 * java.util.Arrays是操作数组的类
 */
public class Array1 {
	public static void main(String[] args){
		int[] array1 = {3,8,4,1,9,10};
		int[] array2 = new int[array1.length];
		//数组的拷贝
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		//数组的排序
		Arrays.sort(array1);
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		// 数组的搜索 (必需是先排好序的数组)
		int index = Arrays.binarySearch(array1,8);
		System.out.print(index);
		System.out.println();
	}
}
