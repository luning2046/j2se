package cys.gh.lesson5;

import java.util.Arrays;

public class ArraysTest {

	/*
	 * System.arraycopy()����Ŀ���
	 * java.util.Arrays ��������в���  ��  ����  ����
	 */
	public static void main(String[] args){
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[10];
		//����Ŀ���
		System.arraycopy(a1, 0, a2, 0, a1.length);
		for(int i=0;i<a2.length;i++){
			System.out.println(a2[i]);
		}
		Arrays.sort(a1);//�������������
		for(int i=0;i<a2.length;i++){
			System.out.println(a2[i]);
		}
	}	
}
