package cys.gh.lesson4_1;

/*
 * ������������з����ڲ����أ� ---ֱ��newһ���ڲ���
 */
public class Test4 {
	public static void main(String[] args){
		//��Ϊ�ڲ���Inner4����Outer4�е�  ����ֱ��new һ���ڲ���ʱ Ҫ����һ���ⲿ��Ķ���
		Outer4 outer4 = new Outer4();
		
		/*
		 *Outer4.Inner4 inner4=new Inner4(); ----����
		 *�����ԭ���ǣ���ΪInner���Է����ⲿ��ĳ�Ա  ���������ɹ��Ļ�����ô����ڲ���
		 *			���ʵ��ⲿ��ĳ�Ա��ʱʲô�أ����ֻ��ͨ��
		 *			 Outer4.Inner4 inner4 = outer4.new Inner4();�ſ��ԣ�ֻҪ��������֪�� �ڲ��������ʵ�
		 *			�ⲿ���Ա  �����outer4�Ķ��󰺳�Ա
		 */
		//Outer4.Inner4  ��ʾ�����ⲿ����ڲ���
		Outer4.Inner4 inner4 = outer4.new Inner4(); 
		inner4.print();
	}
}
class Outer4{
	 private  int index=100;
	 
	 //�ڲ���
	 class Inner4{
		 void print(){
			 System.out.println(index);//�����ⲿ��ĳ�Ա����
		 }
	 }
}
