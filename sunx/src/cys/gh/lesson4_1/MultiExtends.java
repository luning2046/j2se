package cys.gh.lesson4_1;

/*
 * 本例是内部类的一个使用场景：
 * 	通过内部类  实现c++中多重继承
 */
class A{
	void fn1(){
		
	}
}
abstract class B{
	abstract void fn2();
}

class C extends A{
	B getB(){
		return new B(){
			public void fn2(){
				
			}
		};
	}
}
public class MultiExtends {
	static void method1(A a){
		a.fn1();
	}
	static void mehtod2(B b){
		b.fn2();
	}
	public static void main(String[] args){
		C c = new C();
		method1(c);
		mehtod2(c.getB());
	}
}
