package cys.gh.lesson4_1;

/*
 * �ڲ�����ⲿ�����ͬ���ĳ�Ա����
 * �ڲ�����η��� ������ͬ���ĳ�Ա�����أ�
 * 
 * ������ �ڲ���Inner������this���ָ����������������
 * 				ͬʱ�� Outer.this���ָ��Inner�ڲ������ڵ��ⲿ��ĵ��������
 * 								����ͨ��Outer.this�������ⲿ���еĳ�Ա��
 */
public class Test2 {
	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.print();
	}
}
class Outer2{
	
	 private  int index=100;
	 
	 //�ڲ���
	 class Inner2{
		 private  int index=20;
		 void print(){
			 int index=5;
			 System.out.println(index);//���ʱ������ľֲ�����
			 System.out.println(this.index);//�����ڲ���ĳ�Ա����
			 
			//�����ⲿ��ĳ�Ա����  ����ͨ��Outer.this�������ⲿ���еĳ�Ա��
			 System.out.println(Outer2.this.index);
		 }
	 }
	 
	 //�ⲿ�෽�������ڲ�����󼰷���
	 void print(){
		 Inner2 i = new Inner2();
		 i.print();
	 }
}
