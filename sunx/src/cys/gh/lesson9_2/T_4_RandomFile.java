package cys.gh.lesson9_2;

import java.io.IOException;
import java.io.RandomAccessFile;
/*
 * RandomAccessFile写入到指定文件中，就相当于写入到了一个大的byte型数组 ，有下标标识每个数组值的
 * 索引（用getFilePointer()方法获得）
 */
public class T_4_RandomFile {

	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student(1,"cys",100);
		Student s2 = new Student(2,"cyy",60);
		Student s3 = new Student(3,"gh",30);
		
		//这个类的构造方法的第二个参数 是这的流处理方式  即可读又可写
		RandomAccessFile raf = new RandomAccessFile("student.txt","rw");
		//将三个对象写入到文件student.txt中
		s1.writeStudent(raf);
		s3.writeStudent(raf);
		s2.writeStudent(raf);
		
		Student s = new Student();
		//由于上面的写入操作也移动光标的，此时光标已指向文件的最后，通过此语句使光标执行文件头
		raf.seek(0);
		//从student.txt文件中读出三个对象
		//raf.length()获取文件的长度
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
		//这个方法将字符串写入的同时还记录字符长的长度，当用readUTF()方法读的时候就可以知道读多长的数据了
		raf.writeUTF(name);
		raf.writeDouble(score);
	}
	
	public void readStudent(RandomAccessFile raf) throws IOException{
		num = raf.readInt();
		name=raf.readUTF();
		score=raf.readDouble();
	}
}
