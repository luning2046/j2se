package cys.gh;

/**
 * ���������ɫ
 * @author Administrator
 *
 */
public interface Watchered {

	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void nofifyWatcher(String str);
}
