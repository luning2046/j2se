package cys.gh.lesson4_2;

public class ExceptionTest3 {
	/*
	 * ע����ExceptionTest1�Ա�
	 */
	public static void main(String[] args){
		int i = 0;
		try{
			i = 1/0;
		}catch(Exception e){
			//�������˴˾� �������һ�䲻�ᱻִ��
			throw new RuntimeException();
		}finally{
			System.out.println("�һ�ִ�� !");//��ִ��
		}
		//�����ڴ����쳣ʱ ���׳��ˣ�throw new RuntimeException();��
		//���Բ�ִ�д˾�
		System.out.println("�Ҳ���ִ�� !");//����ִ��
	}
}
