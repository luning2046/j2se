package cys.gh.lesson4_1;

/*
 * �������ڲ����һ��ʹ�ó�����
 * 	ͨ���ڲ���  ʵ��c++�ж��ؼ̳�
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
