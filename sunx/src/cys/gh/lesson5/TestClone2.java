package cys.gh.lesson5;
/*
 * 深度克隆 即在一个类中引用了另一个类时的情况
 * 本例中Student类中有一个Teacher类的引用
 */
public class TestClone2 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student s = new Student(1,"cys",new Teacher(1,"gh"));
		Student s_c = (Student)s.clone();
		s_c.teacher.name="cyy";
		System.out.println(s_c.name+","+s_c.teacher.name);
		System.out.println(s.name+","+s.teacher.name);
	}
}

class Student implements Cloneable{
	 int sid;
	 String name;
	 Teacher teacher;
	Student(int sid,String name,Teacher teacher){
		this.sid=sid;
		this.name=name;
		this.teacher=teacher;
	}
	public Object clone() throws CloneNotSupportedException{
		Student student = null;
		student = (Student)super.clone();
		//就多这一条语句
		student.teacher = (Teacher)teacher.clone();
		return student;
	}
}

class Teacher implements Cloneable{
	 int id;
	 String name;
	Teacher(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException{
		Object o = null;
		o=(Teacher)super.clone();
		return o;
	}
}
