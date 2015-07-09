package cys.gh.lesson8;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * ��ӵ�treeSet������Ԫ��  �Զ���������
 * ���  �������������͵�Ԫ��Ҫʵ����comparable�ӿ�
 */
public class TestTreeSet_6 {

	
	public static void main(String[] args) {
		TreeSet<Student3> ts = new TreeSet<Student3>();
		ts.add(new Student3(2,"cys"));
		ts.add(new Student3(1,"cyu"));
		ts.add(new Student3(2,"df"));
		
		Iterator<Student3> iter = ts.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
class Student3 implements Comparable<Student3>{
	private int num;
	private String name;
	
	public Student3(int num ,String name){
		this.num=num;
		this.name=name;
	}
	
	//�Ȱ�num�Ƚ� ���ٰ�name�Ƚ�
	public int compareTo(Student3 s) {
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