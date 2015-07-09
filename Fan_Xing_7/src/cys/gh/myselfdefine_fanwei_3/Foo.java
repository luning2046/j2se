package cys.gh.myselfdefine_fanwei_3;

import java.util.ArrayList;
import java.util.List;

/*
 * 让 T 只能是某个指定的类型或这个指定类型的子类型
 * 规定了 T 的类型范围
 * 这种规则的形式：就是extends表示
 */
public class Foo<T extends List> {
	private T f;
	
	
	public T getF() {
		return f;
	}


	public void setF(T f) {
		this.f = f;
	}


	public static void main(String[] args){
		//f1中指定的类型 只能是List类型或其子类型
		Foo<ArrayList> f1 = new Foo<ArrayList>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		f1.setF(al);
		ArrayList arrayList = f1.getF();
		System.out.println(arrayList.size());
	}
}
