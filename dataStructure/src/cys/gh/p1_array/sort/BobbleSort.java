package cys.gh.p1_array.sort;

public class BobbleSort {

	/**
	 * Ã°ÅÝÅÅÐò
	 */
	public static void main(String[] args) {
		int[] arry = {3,5,1,2,4,7,6};
		int len = arry.length;
		for(int i=len-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arry[j]>arry[j+1]){
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		for(int i=0;i<len;i++){
			System.out.print(arry[i]+", ");
		}
	}
}
