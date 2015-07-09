package cys.gh.lesson5;

import java.util.Arrays;

/*
 * 引用类型的比较 必须实现Compareble接口  
 * 并覆盖compareTo方法
 */
public class TestCompare {

	public static void main(String[] args){
		Student1[] sa1 = new Student1[]{new Student1(3,"cys"),
										new Student1(1,"gh"),
										new Student1(3,"xxx"),
										new Student1(2,"cyy")};
		for(int i=0;i<sa1.length;i++){
			System.out.println(sa1[i]);
		}
		Arrays.sort(sa1);//数组排序，要求数组元素必须实现了Comparable接口
		for(int i=0;i<sa1.length;i++){
			System.out.println(sa1[i]);
		}
	}
	
}
//按学好排序     
class Student1 implements Comparable<Student1>{

	private int num;
	private String name;
	public Student1(int num,String name){
		this.num=num;
		this.name=name;
	}
	
	public int compareTo(Student1 stu) {
		int result = num==stu.num?0:(num>stu.num?1:-1);//0表示相等   1表示大于  -1表示小于;
		if(result==0){//如果num相等  则按name的排序
			name.compareTo(stu.name);//String默认实现了Comparable  按依次比较字母的顺序排列
		}
		return result;
	}
	
	public String toString(){
		return num+":"+name;
	}
}
