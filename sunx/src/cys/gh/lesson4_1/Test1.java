package cys.gh.lesson4_1;
/*
 * �ڲ�������ⲿ��ĳ�Ա���������
 * 
 * ������ �ڲ���Inner������this���ָ����������������
 * ͬʱ�� Outer.this���ָ��Inner�ڲ������ڵ��ⲿ��ĵ��������
 * ����ͨ��Outer.this�������ⲿ���еĳ�Ա��
 */
public class Test1 {
	public static void main(String[] args){
		Outer1 o = new Outer1();
		o.print();
	}
}
class Outer1{
	 private  int index=100;
	 
	 //�ڲ���
	 class Inner1{
		 
		 private void print(){
			 //�ڲ�����Է����ⲿ������г�Ա,����private���͵ĺ�static���͵�
			 System.out.println(Outer1.this.index);
		 }
	 }
	 
	 //�ⲿ�෽�������ڲ���������з����ͱ��� ����private
	 void print(){
		 Inner1 i = new Inner1();
		 i.print();
	 }
}
