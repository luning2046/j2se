package cys.gh.lesson4_1;

/*
 * 如何在其他类中访问内部类呢？ ---直接new一个内部类
 */
public class Test4 {
	public static void main(String[] args){
		//因为内部类Inner4是在Outer4中的  所以直接new 一个内部类时 要先有一个外部类的对象。
		Outer4 outer4 = new Outer4();
		
		/*
		 *Outer4.Inner4 inner4=new Inner4(); ----错误
		 *错误的原因是：因为Inner可以访问外部类的成员  ，如果这个成功的话，那么这个内部类
		 *			访问的外部类的成员有时什么呢？因此只能通过
		 *			 Outer4.Inner4 inner4 = outer4.new Inner4();才可以，只要这样才能知道 内部类对象访问的
		 *			外部类成员  是这个outer4的对象昂成员
		 */
		//Outer4.Inner4  表示访问外部类的内部类
		Outer4.Inner4 inner4 = outer4.new Inner4(); 
		inner4.print();
	}
}
class Outer4{
	 private  int index=100;
	 
	 //内部类
	 class Inner4{
		 void print(){
			 System.out.println(index);//访问外部类的成员变量
		 }
	 }
}
