package cys.gh.lesson4_2;

public class GetMessage {
	
	public static void main(String[] args){
		try{
			AA.foo(0);
		}catch(RuntimeException e){
			//通过e.getMessage()
			//获得throw new RuntimeException("输入变量不能为0");
			//中参数给定的信息值"输入变量不能为0"
			String inf = e.getMessage();
			System.out.println(inf);
		}
	}
}
class AA{
	public static void foo(int i){
		if(i==0){
			//任何一个异常类都可指定一个参数信息 
			throw new RuntimeException("输入变量不能为0");
		}
	}
}
