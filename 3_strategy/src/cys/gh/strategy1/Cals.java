package cys.gh.strategy1;
/*
 * 本例就定义了一个实现加减乘运算的方法
 */
public class Cals {
	
	public float oper(float a,float b,char c){
		float add = a+b;
		float minus = a-b;
		float  multiply= a*b;
		
		switch (c){
		case '+':
			return add;
		case '-':
			return minus;
		case '*':
			return multiply;
		default :
			return 0.0f;
		}
	}
	public static void main(String[] args){
		Cals c  = new Cals();
		
		System.out.println(c.oper(1f, 2f,'+'));
	}
}
