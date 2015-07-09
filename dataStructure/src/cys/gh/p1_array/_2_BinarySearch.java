package cys.gh.p1_array;

/*
 * ��������Ķ��ֲ��ҷ���
 */
public class _2_BinarySearch {

	public static int find(int searchKey,int[] array){
		int len = array.length;
		int lowerBound = 0;//��λ�±�
		int upperBound = len-1;//��λ�±�
		int curIn;//�м��±�
		
		while(true){
			curIn=(lowerBound+upperBound)/2;
			if(array[curIn]==searchKey){
				return curIn;//�ҵ���
			}else if(lowerBound>upperBound){
				return len;//û�ҵ�
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
