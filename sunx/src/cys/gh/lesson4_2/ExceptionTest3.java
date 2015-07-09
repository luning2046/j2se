package cys.gh.lesson4_2;

public class ExceptionTest3 {
	/*
	 * 注意与ExceptionTest1对比
	 */
	public static void main(String[] args){
		int i = 0;
		try{
			i = 1/0;
		}catch(Exception e){
			//由于有了此句 所以最后一句不会被执行
			throw new RuntimeException();
		}finally{
			System.out.println("我会执行 !");//会执行
		}
		//由于在处理异常时 又抛出了（throw new RuntimeException();）
		//所以不执行此句
		System.out.println("我不会执行 !");//不会执行
	}
}
