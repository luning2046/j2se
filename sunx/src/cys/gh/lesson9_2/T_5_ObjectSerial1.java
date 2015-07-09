package cys.gh.lesson9_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象序列化时，只保存对象的非静态成员变量
 * 不能保存任何的成员方法和静态的成员变量
 */
public class T_5_ObjectSerial1 {

	public static void main(String[] args) throws Exception{
		Employee e1 = new Employee("za",23,12.33);
		Employee e2 = new Employee("ls",23,12.33);
		Employee e3 = new Employee("ww",23,12.33);
		//序列化对象
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		oos.close();
		
		//反序列化对象  ---此时不会调用任何构造方法
		FileInputStream ios = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(ios);
		for(int i=0;i<3;i++){
			Employee e = (Employee)ois.readObject();
			System.out.println(e.age+","+e.name+","+e.salary);
		}
		
	}

}

//这个接口是一个标识接口 没有任何方法
class Employee implements Serializable{
	String name;
	int age;
	double salary;
	transient int aa;//用这个标识符标识的元素在对象序列化时 此变量不会被序列化
	
	public Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
