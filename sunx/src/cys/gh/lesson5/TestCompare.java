package cys.gh.lesson5;

import java.util.Arrays;

/*
 * �������͵ıȽ� ����ʵ��Compareble�ӿ�  
 * ������compareTo����
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
		Arrays.sort(sa1);//��������Ҫ������Ԫ�ر���ʵ����Comparable�ӿ�
		for(int i=0;i<sa1.length;i++){
			System.out.println(sa1[i]);
		}
	}
	
}
//��ѧ������     
class Student1 implements Comparable<Student1>{

	private int num;
	private String name;
	public Student1(int num,String name){
		this.num=num;
		this.name=name;
	}
	
	public int compareTo(Student1 stu) {
		int result = num==stu.num?0:(num>stu.num?1:-1);//0��ʾ���   1��ʾ����  -1��ʾС��;
		if(result==0){//���num���  ��name������
			name.compareTo(stu.name);//StringĬ��ʵ����Comparable  �����αȽ���ĸ��˳������
		}
		return result;
	}
	
	public String toString(){
		return num+":"+name;
	}
}
