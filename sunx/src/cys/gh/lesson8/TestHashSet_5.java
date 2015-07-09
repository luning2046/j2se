package cys.gh.lesson8;

import java.util.HashSet;
import java.util.Iterator;

/*
 * set�����в��ܴ��  �ظ���Ԫ��  �������ظ�Ԫ��
 * ��set��ֻ��   ��һ����ŵ�set��  ������ظ�Ԫ�ر�����
 * ���ڱ����е�����������   �� Person p1 = new Person(1,"cys");
 * 						   Person p2 = new Person(1,"cys");
 * p1��p2 ��ô���ܱ�set���Ͽ������ظ�Ԫ���أ�
 * 			����Ҫ ��дObject�е�   equals������ hashCode()����
 * û��д����������֮ǰ��p1,p2��������������ͬԪ��
 * ��д֮��  ��������������ͬ��Ԫ��
 */
public class TestHashSet_5 {

	public static void main(String[] args){
		HashSet<Person> hs = new HashSet<Person>();
		hs.add(new Person(1,"cys"));//hashCodeֵ��cys.gh.lesson8.Person@1fb8ee3
		hs.add(new Person(1,"cys"));//hashCodeֵ��cys.gh.lesson8.Person@c17164
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
