package cys.gh.lesson4_1;
/*
 * 内部类声明为静态的
 */
public class Test7 {
	public static void main(String[] args){
		
	}
}
class Outer7{
	 private  static int index=100;
	 
	 
	 //静态内部类只能访问静态的成员变量或静态函数
	 //非静态内部类不能有静态的成员变量或函数
	 static class Inner7{
		 private  int index=50;
		 void print(){
			 int index=30;
			 
			 System.out.println(index);
			 System.out.println(this.index);
			//由于index=100是静态的 所以用外部类名访问这index静态成员变量
			 System.out.println(Outer7.index);
		 }
	 }
	 
	 
	 //外部类方法访问内部类对象及方法
	 void print(){
		 Inner7 i = new Inner7();
		 i.print();
	 }
}
