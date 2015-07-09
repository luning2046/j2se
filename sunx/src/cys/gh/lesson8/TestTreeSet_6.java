package cys.gh.lesson8;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 添加到treeSet集合中元素  自动进行排序
 * 因此  ，对于引用类型的元素要实现那comparable接口
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
	
	//先按num比较 ，再按name比较
	public int compareTo(Student3 s) {
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