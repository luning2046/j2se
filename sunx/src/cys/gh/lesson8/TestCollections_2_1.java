package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections_2_1 {

	/**
	 * Collections 类中的方法对集合进行诸如排序等操作
	 * 排序的元素必须实现Compareable接口
	 */
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student(4,"cys"));
		l.add(new Student(1,"cyy"));
		l.add(new Student(6,"gh"));
		l.add(new Student(4,"cqd"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}


class Student implements Comparable<Student>{
	private int num;
	private String name;
	
	public Student(int num ,String name){
		this.num=num;
		this.name=name;
	}
	
	//先按num比较 ，再按name比较
	public int compareTo(Student s) {
		int result=0;
		result = num==s.num?0:(num<s.num?-1:1);
		if(result==0){//如果num相等  则比较name（字符串默认实现了Comparable接口）
			result=name.compareTo(s.name);
		}
		return result;
	}
	
	@Override
	public String toString(){
		return "num="+num+", name="+name;
	}
	
}
