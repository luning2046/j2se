package cys.gh;

/**
 * 具体观察者角色
 * @author Administrator
 *
 */
public class ConcreteWatcher implements Watcher{

	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
