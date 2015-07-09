package cys.gh.lesson9_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ͨ����������ķ������Կ������л��Ĺ���
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
	//������������ķ���  1 ����private�� 2�������κ���ķ���
	//���ܣ������л������л�ʱ�������������������ݣ�����Ĺ�����������Ӧ�����л�
	//���������л������ǣ���д��age��д��name��û��д��salary
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.writeInt(age);
		oos.writeUTF(name);
		System.out.println("֤�� ���л�ʱ�������� writeObject����");
	}
	private void readObject(ObjectInputStream ois) throws IOException{
		age = ois.readInt();
		name = ois.readUTF();
		System.out.println("֤�� �����л�ʱ�������� readObject����");
	}
}
