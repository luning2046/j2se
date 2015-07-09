package cys.gh.lesson4_1;
/*
 * 内部类访问外部类的成员的最简单例子
 * 
 * 本例中 内部类Inner除了有this这个指向自身的特殊变量；
 * 同时有 Outer.this这个指向Inner内部类所在的外部类的的特殊变量
 * 就是通过Outer.this来访问外部类中的成员的
 */
public class Test1 {
	public static void main(String[] args){
		Outer1 o = new Outer1();
		o.print();
	}
}
class Outer1{
	 private  int index=100;
	 
	 //内部类
	 class Inner1{
		 
		 private void print(){
			 //内部类可以访问外部类的所有成员,包括private类型的和static类型的
			 System.out.println(Outer1.this.index);
		 }
	 }
	 
	 //外部类方法访问内部类对象及所有方法和变量 包括private
	 void print(){
		 Inner1 i = new Inner1();
		 i.print();
	 }
}
