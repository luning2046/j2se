package cys.gh.lesson4_2;

public class ExceptionTest2 {
	/*
	 * ��û�з����쳣��ʹ��return��� finally���Ҳ��ִ��
	 */
	public static void main(String[] args){
		try{
			int i = 1/8;
			return;
		}catch(RuntimeException e){
			e.printStackTrace();
		}finally{
			System.out.println("��ִ�� !");
		}
	}
}
