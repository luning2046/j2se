package cys.gh.lesson9_1;

public class T_2_SystemInOut {

	/**
	 * System���е�out ���� ����һ�����׼����豸�������printStream��������������
	 * System���е�in ���� ����һ���ӱ�׼�����豸����� inputStream ����  
	 */
	//�ӱ�׼�����豸�������������ݣ��ٱ�׼����豸��Ļ�����
	public static void main(String[] args) throws Exception{
		int data;
		while((data=System.in.read())!=-1){
			System.out.write(data);
		}
		
	}
	/*
	 * ���磺�������������д˳�������
	 * ���� a  ���س�
	 * ��� 97   //�ַ�a��ASIIC��
	 * ��� 13   //�س���ASIIC��
	 * ��� 10   //���е�ASIIC��
	 * 
	 * 
	 * ����������ʱ  ������ʺš�����
	 */

}
