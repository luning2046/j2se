package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections_2_1 {

	/**
	 * Collections ���еķ����Լ��Ͻ�����������Ȳ���
	 * �����Ԫ�ر���ʵ��Compareable�ӿ�
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
	
	//�Ȱ�num�Ƚ� ���ٰ�name�Ƚ�
	public int compareTo(Student s) {
		int result=0;
		result = num==s.num?0:(num<s.num?-1:1);
		if(result==0){//���num���  ��Ƚ�name���ַ���Ĭ��ʵ����Comparable�ӿڣ�
			result=name.compareTo(s.name);
		}
		return result;
	}
	
	@Override
	public String toString(){
		return "num="+num+", name="+name;
	}
	
}
