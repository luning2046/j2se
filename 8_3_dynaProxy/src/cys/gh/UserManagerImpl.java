package cys.gh;
/*
 * ����һ��ҵ���߼��Ļ������� ��Ҫ������������ִ��ǰ
 * ����һ�°�ȫ�Եļ�� ��һ����̬�Ĵ�����ʵ�ִ˹��� ����һЩû��
 */
public class UserManagerImpl implements UserManager{

	public void add(String name, String password) {
		System.out.println("--------UserManagerImpl.add--------");
	}

	public void delete(int id) {
		System.out.println("--------UserManagerImpl.delete--------");
	}

	public String get(int id) {
		System.out.println("--------UserManagerImpl.get--------");
		return null;
	}

	public void update(int id) {
		System.out.println("--------UserManagerImpl.update--------");
	}

}
