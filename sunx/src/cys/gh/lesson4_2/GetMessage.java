package cys.gh.lesson4_2;

public class GetMessage {
	
	public static void main(String[] args){
		try{
			AA.foo(0);
		}catch(RuntimeException e){
			//ͨ��e.getMessage()
			//���throw new RuntimeException("�����������Ϊ0");
			//�в�����������Ϣֵ"�����������Ϊ0"
			String inf = e.getMessage();
			System.out.println(inf);
		}
	}
}
class AA{
	public static void foo(int i){
		if(i==0){
			//�κ�һ���쳣�඼��ָ��һ��������Ϣ 
			throw new RuntimeException("�����������Ϊ0");
		}
	}
}
