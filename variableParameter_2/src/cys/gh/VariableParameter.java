package cys.gh;

public class VariableParameter {

	public static void main(String[] args){
		System.out.println(add(2,3));
		System.out.println(add(1,2,4,5));
	}
	//可变参数 必须定义在所有参数的最后
	//调用可变参数的方法时，编译器为该可变参数隐含
	//创建一个数组，在方法体中一数组的形式访问可变参数
	public static int add(int a ,int...args){
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}
}
