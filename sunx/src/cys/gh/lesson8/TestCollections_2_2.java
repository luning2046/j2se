package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections_2_2 {

	/**
	 * Collections 类中的方法对集合进行诸如排序等操作
	 * 为排序的元素指定一个比较器，待排序集合根据比较器 来比较
	 * 因为这个比较器就跟这个Student1类相关  所以就用内部类实现了一个比较器
	 */
	public static void main(String[] args) {
		ArrayList<Student1> l = new ArrayList<Student1>();
		l.add(new Student1(4,"cys"));
		l.add(new Student1(1,"cyy"));
		l.add(new Student1(6,"gh"));
		l.add(new Student1(4,"cqd"));
		System.out.println(l);
		Collections.sort(l,new Student1.StudentComparator());
		System.out.println(l);
	}
}


class Student1 {
	private int num;
	private String name;
	
	public Student1(int num ,String name){
		this.num=num;
		this.name=name;
	}
	//实现了一个Student1的比较器
	static class StudentComparator implements Comparator<Student1>{

		public int compare(Student1 o1, Student1 o2) {
			int result=0;
			result = o1.num==o2.num?0:(o1.num<o2.num?-1:1);
			
			if(result==0){
				result=o1.name.compareTo(o2.name);
			}
			return result;
		}
		
	}
	
	@Override
	public String toString(){
		return "num="+num+", name="+name;
	}
	
}
