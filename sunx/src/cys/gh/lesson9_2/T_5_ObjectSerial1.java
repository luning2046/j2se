package cys.gh.lesson9_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * �������л�ʱ��ֻ�������ķǾ�̬��Ա����
 * ���ܱ����κεĳ�Ա�����;�̬�ĳ�Ա����
 */
public class T_5_ObjectSerial1 {

	public static void main(String[] args) throws Exception{
		Employee e1 = new Employee("za",23,12.33);
		Employee e2 = new Employee("ls",23,12.33);
		Employee e3 = new Employee("ww",23,12.33);
		//���л�����
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		oos.close();
		
		//�����л�����  ---��ʱ��������κι��췽��
		FileInputStream ios = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(ios);
		for(int i=0;i<3;i++){
			Employee e = (Employee)ois.readObject();
			System.out.println(e.age+","+e.name+","+e.salary);
		}
		
	}

}

//����ӿ���һ����ʶ�ӿ� û���κη���
class Employee implements Serializable{
	String name;
	int age;
	double salary;
	transient int aa;//�������ʶ����ʶ��Ԫ���ڶ������л�ʱ �˱������ᱻ���л�
	
	public Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
