package cys.gh;
/*
 * ����һ��ҵ���߼��Ļ������� ��Ҫ������������ִ��ǰ
 * ����һ�°�ȫ�Եļ�� ��һ����̬�Ĵ�����ʵ�ִ˹��� ����һЩû��
 */
public class UserManagerImpl implements UserManager{
	@Override
	public void add(String name, String password) {
		System.out.println("--------UserManagerImpl.add--------");
	}
	@Override
	public void delete(int id) {
		System.out.println("--------UserManagerImpl.delete--------");
	}
	@Override
	public String get(int id) {
		System.out.println("--------UserManagerImpl.get--------");
		return null;
	}
	@Override
	public void update(int id) {
		System.out.println("--------UserManagerImpl.update--------");
	}

}
