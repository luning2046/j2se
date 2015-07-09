package cys.gh.lesson4_1;

/*
 * 内部类可以定义在一个外部类的成员方法中，
 * 且内部类的成员方法可以访问该方法的final类型参数或局部变量
 * 非final类型的变量  不可被访问
 * 
 */
public class Test5 {
	public static void main(String[] args){
		Outer5 o = new Outer5();
		o.fn2();
	}
}
class Outer5{
	 private  int index=100;
	 
	 //内部类也可以定义在外部类的方法中
	 public void fn(){
		 //int a;方法内部的局部变量  内部类不能访问
		 final int b = 1;
		 
		 class Inner5{
			 
			 void print(){
				 System.out.println(index);//访问外部类的成员变量
				 //System.out.println(a);错----如果内部类要访问它所在方法的局部变量如a或参数，
				 								//则该变量或参数必须定义为final
				 System.out.println(b);//正确
			 }
		 }
		 
		 new Inner5().print();//使用内部类，必须用内部类new一个对象
	 }
	 
	 //在方法中定义一个匿名内部类,并使用了该匿名内部类
	 public void fn2(){
		 new Object(){

			@Override
			public String toString() {
				String retVal = super.toString();
				System.out.println(retVal);
				return retVal;
			}
			 
		 }.toString();
	 }
}
