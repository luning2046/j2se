package cys.gh;

/**
 * ����۲��߽�ɫ
 * @author Administrator
 *
 */
public class ConcreteWatcher implements Watcher{

	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
