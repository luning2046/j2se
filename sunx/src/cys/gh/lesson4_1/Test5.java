package cys.gh.lesson4_1;

/*
 * �ڲ�����Զ�����һ���ⲿ��ĳ�Ա�����У�
 * ���ڲ���ĳ�Ա�������Է��ʸ÷�����final���Ͳ�����ֲ�����
 * ��final���͵ı���  ���ɱ�����
 * 
 */
public class Test5 {
	public static void main(String[] args){
		Outer5 o = new Outer5();
		o.fn2();
	}
}
class Outer5{
	 private  int index=100;
	 
	 //�ڲ���Ҳ���Զ������ⲿ��ķ�����
	 public void fn(){
		 //int a;�����ڲ��ľֲ�����  �ڲ��಻�ܷ���
		 final int b = 1;
		 
		 class Inner5{
			 
			 void print(){
				 System.out.println(index);//�����ⲿ��ĳ�Ա����
				 //System.out.println(a);��----����ڲ���Ҫ���������ڷ����ľֲ�������a�������
				 								//��ñ�����������붨��Ϊfinal
				 System.out.println(b);//��ȷ
			 }
		 }
		 
		 new Inner5().print();//ʹ���ڲ��࣬�������ڲ���newһ������
	 }
	 
	 //�ڷ����ж���һ�������ڲ���,��ʹ���˸������ڲ���
	 public void fn2(){
		 new Object(){

			@Override
			public String toString() {
				String retVal = super.toString();
				System.out.println(retVal);
				return retVal;
			}
			 
		 }.toString();
	 }
}
