package cys.gh.lesson4_2;

public class ExceptionTest1 {
	
	public static void main(String[] args){
		try{
			int i = 1/0;//�����쳣������������Ͳ�ִ���ˣ�ֱ������catch��ִ��
			System.out.println("�Ҳ���ִ�� !");
		}catch(RuntimeException e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		//��Ϊ�쳣�Ѿ�������ϣ�e.printStactTrace������ӡ����
		//����ִ�д˾�
		System.out.println("��ִ�� !");
	}
}
