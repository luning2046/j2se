package cys.gh.lesson9_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 通过两个特殊的方法可以控制序列化的过程
 */
public class T_5_ObjectSerial2 {

	public static void main(String[] args) throws Exception{
		Employee1 e1 = new Employee1("za",23,12.33);
		
		
		FileOutputStream fos = new FileOutputStream("employee1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		oos.close();
		
		FileInputStream ios = new FileInputStream("employee1.txt");
		ObjectInputStream ois = new ObjectInputStream(ios);
		
		Employee1 e = (Employee1)ois.readObject();
		System.out.println(e.age+","+e.name+","+e.salary);
		
	}

}

//
class Employee1 implements Serializable{
	String name;
	int age;
	double salary;
	
	public Employee1(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	//这是两个特殊的方法  1 它是private的 2不属于任何类的方法
	//功能：当序列化反序列化时按照这两个方法中内容（定义的规则）来进行相应的序列化
	//本例中序列化规则是：先写入age再写入name，没有写入salary
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.writeInt(age);
		oos.writeUTF(name);
		System.out.println("证明 序列化时调用了我 writeObject方法");
	}
	private void readObject(ObjectInputStream ois) throws IOException{
		age = ois.readInt();
		name = ois.readUTF();
		System.out.println("证明 反序列化时调用了我 readObject方法");
	}
}
