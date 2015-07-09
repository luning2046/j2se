package cys.gh;

/**
 * 抽象主题角色
 * @author Administrator
 *
 */
public interface Watchered {

	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void nofifyWatcher(String str);
}
