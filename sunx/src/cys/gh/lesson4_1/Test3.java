package cys.gh.lesson4_1;

/*
 * ������������з����ڲ����أ� ---ͨ���ⲿ��ķ�������ڲ����һ������
 */
public class Test3 {
	public static void main(String[] args){
		//����������ͨ���ⲿ��ķ�������ڲ����һ������
		Outer3 outer3 = new Outer3();
		Outer3.Inner3 inner3 = outer3.getInner3();
		inner3.print();
	}
}
class Outer3{
	 private  int index=100;
	 
	 //�ڲ���
	 class Inner3{
		 void print(){
			 System.out.println(index);//�����ⲿ��ĳ�Ա����
		 }
	 }
	
	 //�ⲿ��ķ����������� ����һ���ڲ��Ķ���
	 public Inner3 getInner3(){
		 return new Inner3();
	 }
}