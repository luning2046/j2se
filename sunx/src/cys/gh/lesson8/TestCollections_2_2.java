package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections_2_2 {

	/**
	 * Collections ���еķ����Լ��Ͻ�����������Ȳ���
	 * Ϊ�����Ԫ��ָ��һ���Ƚ����������򼯺ϸ��ݱȽ��� ���Ƚ�
	 * ��Ϊ����Ƚ����͸����Student1�����  ���Ծ����ڲ���ʵ����һ���Ƚ���
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
	//ʵ����һ��Student1�ıȽ���
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
