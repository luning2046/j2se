package cys.gh.lesson1;
//byte�����������͵�����
public class ByteModelProblem {

	public static void main(String[] args){
		byte b;
		b=13;//�κ�һ�����������ͷ�Χ�ڵ�������3����Ĭ����������Ϊint,֮���Ա�����û�б�������Ϊ���������-127��126֮�䣬���������Χ���Ǳ������ ���桰��ʧ�����쳣��
		//b=b*3;��������ԭ����һ������3��int���ͣ�b��byte���ͣ��ں�int��������ʱ�Զ���������ͽ�������Ϊint���� ����int���ͽ������byte���;ͻᱨ��
		//b*=3; �˾䲻������������������Զ�����ǿ������ת��
//		byte a,c; b = a+c; ���������뱨������byte���͵ı����������㣬��������ܳ���byte���͵ķ�Χ��
		b=(byte)(b*3);//������ȷ
		System.out.println(b);
		
		
		int i=4;
		//short s = i;���� ��Ϊi��int�ԣ����ȸߣ�s��short�����ȵͣ��ᷢ���쳣Ҫǿ������ת��
		short s = (short)i;//����
		System.out.println(s);
		
		
		float f=0.0f;
		//f=1.3;��������1.3Ĭ�ϵ�����������double���� ����ʧ�����쳣
		f=1.3f;//��ȷ ���������һ��f��ʾfloat����
		double d=2.3;//��ȷ
		boolean bool=true;//boolean����ֻ��ȡtrue��false����ֵ
		System.out.println(d+","+bool);
		
		
		//���鸶����ʼֵ���׳���
		int[] arry1 ={1,2,3,3};//��ȷ
		int[] arry2= new int[]{1,2,2};//��ȷ
		//int[] arry3=new int[3]{1,2,2};//�������ͨ����
		
		int[] arry4;
		//arry4 = {2,3,4};//�������ͨ����
		
		int c=0;
		System.out.println(c++);//���Ϊ0  ��ִ�е�c++ʱ����ʹ�ú��1 ��˱�����ʹ�����
		System.out.println(c);//���Ϊ1  ��Ϊc++������������  ����Ϊ1
	}
}
