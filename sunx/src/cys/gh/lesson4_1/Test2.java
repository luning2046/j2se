package cys.gh.lesson4_1;

/*
 * 内部类和外部类的有同名的成员变量
 * 内部类如何访问 这两个同名的成员变量呢？
 * 
 * 本例中 内部类Inner除了有this这个指向自身的特殊变量；
 * 				同时有 Outer.this这个指向Inner内部类所在的外部类的的特殊变量
 * 								就是通过Outer.this来访问外部类中的成员的
 */
public class Test2 {
	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.print();
	}
}
class Outer2{
	
	 private  int index=100;
	 
	 //内部类
	 class Inner2{
		 private  int index=20;
		 void print(){
			 int index=5;
			 System.out.println(index);//访问本函数的局部变量
			 System.out.println(this.index);//访问内部类的成员变量
			 
			//访问外部类的成员变量  就是通过Outer.this来访问外部类中的成员的
			 System.out.println(Outer2.this.index);
		 }
	 }
	 
	 //外部类方法访问内部类对象及方法
	 void print(){
		 Inner2 i = new Inner2();
		 i.print();
	 }
}
