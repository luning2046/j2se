package cys.gh.lesson6;

import java.util.Arrays;

/*����Ԫ���ǻ����������͵����� ����Ĭ��ʵ����compareable�ӿڣ�
 * System.arraycopy ���� ����Ŀ���
 * java.util.Arrays�ǲ����������
 */
public class Array1 {
	public static void main(String[] args){
		int[] array1 = {3,8,4,1,9,10};
		int[] array2 = new int[array1.length];
		//����Ŀ���
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		//���������
		Arrays.sort(array1);
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		// ��������� (���������ź��������)
		int index = Arrays.binarySearch(array1,8);
		System.out.print(index);
		System.out.println();
	}
}
