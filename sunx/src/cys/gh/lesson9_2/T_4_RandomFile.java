package cys.gh.lesson9_2;

import java.io.IOException;
import java.io.RandomAccessFile;
/*
 * RandomAccessFileд�뵽ָ���ļ��У����൱��д�뵽��һ�����byte������ �����±��ʶÿ������ֵ��
 * ��������getFilePointer()������ã�
 */
public class T_4_RandomFile {

	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student(1,"cys",100);
		Student s2 = new Student(2,"cyy",60);
		Student s3 = new Student(3,"gh",30);
		
		//�����Ĺ��췽���ĵڶ������� �����������ʽ  ���ɶ��ֿ�д
		RandomAccessFile raf = new RandomAccessFile("student.txt","rw");
		//����������д�뵽�ļ�student.txt��
		s1.writeStudent(raf);
		s3.writeStudent(raf);
		s2.writeStudent(raf);
		
		Student s = new Student();
		//���������д�����Ҳ�ƶ����ģ���ʱ�����ָ���ļ������ͨ�������ʹ���ִ���ļ�ͷ
		raf.seek(0);
		//��student.txt�ļ��ж�����������
		//raf.length()��ȡ�ļ��ĳ���
		for(long i = 0;i<raf.length();i=raf.getFilePointer()){
			s.readStudent(raf);
			System.out.println(s.num+","+s.name+","+s.score);
		}
		raf.close();
	}

}

class Student{
	int num;
	String name;
	double score;
	
	public Student(){}
	
	public Student(int num,String name,double score){
		this.num=num;
		this.name=name;
		this.score=score;
	}
	
	public void writeStudent(RandomAccessFile raf) throws IOException{
		raf.writeInt(num);
		//����������ַ���д���ͬʱ����¼�ַ����ĳ��ȣ�����readUTF()��������ʱ��Ϳ���֪�����೤��������
		raf.writeUTF(name);
		raf.writeDouble(score);
	}
	
	public void readStudent(RandomAccessFile raf) throws IOException{
		num = raf.readInt();
		name=raf.readUTF();
		score=raf.readDouble();
	}
}
