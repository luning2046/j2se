package cys.gh.lesson9_1;

public class T_3_TestByte {

	public static void main(String[] args){
		byte[] bs1 = "���ε绰".getBytes();
		for(int i=0;i<bs1.length;i++){
			/*
			 * �����ַ���������
			 * ԭ���ǣ������ֽ����������̨��ʱ��System.out.println((char)bs1[i])���
			 * ���߿���̨ ��һ���ֽڵ���ʽ���� ��ζ��������ݣ���һ�������������ֽڱ�ʾ���Գ�������
			 * ���Ӣ�������ASCII��ʱ�����ھ���һ���ֽڱ�ʾ�ģ����Ե�����̨��һ���ֽڽ���ʱ��Ҳ��
			 * ������������� ������ȷ��ʾ
			 */
			System.out.println(bs1[i]);//�����������ֵȫΪ��ֵ
			//���Ը�����תΪ�ַ���Ϊ��ASCII��ķǷ��ַ����������ֵΪ�ʺţ�
			System.out.println((char)bs1[i]);//���ֵȫ���ʺ�"?"
		}
		
		byte[] bs2 = "cysghg".getBytes();
		for(int i=0;i<bs2.length;i++){
			System.out.println((char)bs2[i]);//��ASCII���Ӧ���ַ���byte���Ϳ����໥ת��
		}
	}
}
