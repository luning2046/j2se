package cys.gh.lesson4_2;

public class ExceptionTest1 {
	
	public static void main(String[] args){
		try{
			int i = 1/0;//发生异常后，它后面的语句就不执行了，直接跳到catch中执行
			System.out.println("我不会执行 !");
		}catch(RuntimeException e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		//因为异常已经处理完毕（e.printStactTrace（）打印错误）
		//所以执行此句
		System.out.println("会执行 !");
	}
}
