package cys.gh.extends_5;
/*
 * 因为子类child是从父类parent继承而来的
 * 所以，父类指定的数据类型；子类也要继承并指定
 */
public class Child<T1, T2,T3> extends Parent<T1,T2>{
	private T3 foo3;

	public T3 getFoo3() {
		return foo3;
	}

	public void setFoo3(T3 foo3) {
		this.foo3 = foo3;
	}
	
	public static void main(String[] args){
		Parent<String,String> p = new Parent<String,String>();
		p.setFoo1("cys");
		p.setFoo2("gh");
		System.out.println(p.getFoo1());
		
		Child<Integer,Integer,Integer> c = new Child<Integer,Integer,Integer>();
		c.setFoo1(1);
		System.out.println(c.getFoo1());
	}
}
