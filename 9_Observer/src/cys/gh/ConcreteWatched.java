package cys.gh;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������ɫ
 * @author Administrator
 *
 */
public class ConcreteWatched implements Watchered{

	private List<Watcher> watchers = new ArrayList<Watcher>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		watchers.add(watcher);
	}
	@Override
	public void removeWatcher(Watcher watcher) {
		watchers.remove(watcher);
	}
	
	@Override
	public void nofifyWatcher(String str) {
		for(Watcher watcher : watchers){
			watcher.update(str);
		}
	}
}
