package cys.gh.deprecated_1;

/*
 * deprecatedע�⣺����ǹ�ʱ��API
 * 
 * ��������A������һ������mm������ô�ע���ʶ������TestDeprecated��
 * 	��ʹ��mm����ʱ�������ᱨ����eclispe�����лᷢ���棨�û�ɫ��飩��˵TestDeprecate�������˹�ʱ�ķ���mm
 */

class A{
	//����mm������һ����ʱ�ķ���
	@Deprecated
	public void mm(){
		System.out.println("ksjfsdf");
	}
	
}

public class TestDeprecated {
	public static void main(String[] args){
		new A().mm();
	}

}
