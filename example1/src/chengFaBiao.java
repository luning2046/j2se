
/**
 *  1*1 
	2*1 2*2 
	3*1 3*2 3*3 
	4*1 4*2 4*3 4*4 
	5*1 5*2 5*3 5*4 5*5 
	6*1 6*2 6*3 6*4 6*5 6*6 
	7*1 7*2 7*3 7*4 7*5 7*6 7*7 
	8*1 8*2 8*3 8*4 8*5 8*6 8*7 8*8 
	9*1 9*2 9*3 9*4 9*5 9*6 9*7 9*8 9*9 
 *
 */
public class chengFaBiao {

	/**
	 * ����žų˷���
	 */
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+" ");
			}
			System.out.println();
		}
	}

}
