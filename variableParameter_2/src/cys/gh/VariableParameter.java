package cys.gh;

public class VariableParameter {

	public static void main(String[] args){
		System.out.println(add(2,3));
		System.out.println(add(1,2,4,5));
	}
	//�ɱ���� ���붨�������в��������
	//���ÿɱ�����ķ���ʱ��������Ϊ�ÿɱ��������
	//����һ�����飬�ڷ�������һ�������ʽ���ʿɱ����
	public static int add(int a ,int...args){
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}
}
