package cys.gh.lesson4_1;
/*
 * �ڲ�������Ϊ��̬��
 */
public class Test7 {
	public static void main(String[] args){
		
	}
}
class Outer7{
	 private  static int index=100;
	 
	 
	 //��̬�ڲ���ֻ�ܷ��ʾ�̬�ĳ�Ա������̬����
	 //�Ǿ�̬�ڲ��಻���о�̬�ĳ�Ա��������
	 static class Inner7{
		 private  int index=50;
		 void print(){
			 int index=30;
			 
			 System.out.println(index);
			 System.out.println(this.index);
			//����index=100�Ǿ�̬�� �������ⲿ����������index��̬��Ա����
			 System.out.println(Outer7.index);
		 }
	 }
	 
	 
	 //�ⲿ�෽�������ڲ�����󼰷���
	 void print(){
		 Inner7 i = new Inner7();
		 i.print();
	 }
}
