package cys.gh.lesson4_1;
/*
 * 内部类可以向成员方法 一样可以
 * 有public\private\protected\default\abstract\static访问修饰符 且与成员方法的作用域一致
 */
public class Test6 {
	public static void main(String[] args){
		
	}
}
class Outer6{
	 private  int index=100;
	 
	 //内部类可以向成员方法 一样可以有public\private\protected\default\abstract\static访问修饰符 
	 //且与成员方法的作用域一致
	 public class Inner6{
		 //static int bb; 错！  非静态内部类不能有静态的成员变量或函数
		 void print(){
			 //内部类可以访问外部类的所有成员,包括private类型的和static类型的
			 System.out.println(index);
		 }
	 }
	 
	 //外部类方法访问内部类对象及方法
	 void print(){
		 Inner6 i = new Inner6();
		 i.print();
	 }
}
