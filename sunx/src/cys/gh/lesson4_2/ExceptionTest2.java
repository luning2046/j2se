package cys.gh.lesson4_2;

public class ExceptionTest2 {
	/*
	 * 当没有发生异常即使有return语句 finally语句也被执行
	 */
	public static void main(String[] args){
		try{
			int i = 1/8;
			return;
		}catch(RuntimeException e){
			e.printStackTrace();
		}finally{
			System.out.println("会执行 !");
		}
	}
}
