package cys.gh.lesson8;

import java.util.HashSet;
import java.util.Iterator;

/*
 * set集合中不能存放  重复的元素  如果存放重复元素
 * 在set中只能   有一个存放到set中  其余的重复元素被丢弃
 * 对于本例中的引用型数据   如 Person p1 = new Person(1,"cys");
 * 						   Person p2 = new Person(1,"cys");
 * p1与p2 怎么才能被set集合看作是重复元素呢？
 * 			则需要 重写Object中的   equals（）和 hashCode()方法
 * 没重写这俩个方法之前，p1,p2被看作是两个不同元素
 * 重写之后  被看作是两个相同的元素
 */
public class TestHashSet_5 {

	public static void main(String[] args){
		HashSet<Person> hs = new HashSet<Person>();
		hs.add(new Person(1,"cys"));//hashCode值是cys.gh.lesson8.Person@1fb8ee3
		hs.add(new Person(1,"cys"));//hashCode值是cys.gh.lesson8.Person@c17164
		hs.add(new Person(3,"cyy"));
		hs.add(new Person(4,"gh"));
		
		Iterator<Person> iter = hs.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
}

class Person{
	private int no;
	private String name;
	
	public Person(int no,String name){
		this.no=no;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return no==p.no && name.equals(p.name);
	}

	@Override
	public int hashCode() {
		return no*name.hashCode();
	}
	@Override
	public String toString(){
		return "no="+no+",name="+name;
	}
}
