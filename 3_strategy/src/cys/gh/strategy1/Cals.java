package cys.gh.strategy1;
/*
 * �����Ͷ�����һ��ʵ�ּӼ�������ķ���
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
