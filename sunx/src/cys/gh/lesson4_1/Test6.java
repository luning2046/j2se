package cys.gh.lesson4_1;
/*
 * �ڲ���������Ա���� һ������
 * ��public\private\protected\default\abstract\static�������η� �����Ա������������һ��
 */
public class Test6 {
	public static void main(String[] args){
		
	}
}
class Outer6{
	 private  int index=100;
	 
	 //�ڲ���������Ա���� һ��������public\private\protected\default\abstract\static�������η� 
	 //�����Ա������������һ��
	 public class Inner6{
		 //static int bb; ��  �Ǿ�̬�ڲ��಻���о�̬�ĳ�Ա��������
		 void print(){
			 //�ڲ�����Է����ⲿ������г�Ա,����private���͵ĺ�static���͵�
			 System.out.println(index);
		 }
	 }
	 
	 //�ⲿ�෽�������ڲ�����󼰷���
	 void print(){
		 Inner6 i = new Inner6();
		 i.print();
	 }
}
