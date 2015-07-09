package cys.gh.p1_array;

/*
 * 有序数组的二分查找法。
 */
public class _2_BinarySearch {

	public static int find(int searchKey,int[] array){
		int len = array.length;
		int lowerBound = 0;//低位下标
		int upperBound = len-1;//高位下标
		int curIn;//中间下标
		
		while(true){
			curIn=(lowerBound+upperBound)/2;
			if(array[curIn]==searchKey){
				return curIn;//找到了
			}else if(lowerBound>upperBound){
				return len;//没找到
			}else if(array[curIn]<searchKey){
					lowerBound = curIn+1;
			}else{
				upperBound=curIn-1;
			}
		}
	}
	
	public static void main(String[] args){
		int[] array={3,5,7,8,9,10,22,53};
		int ret = find(5,array);
		System.out.println(ret);
	}
}
