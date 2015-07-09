package cys.gh;

public class Client {

	public static void main(String[] args) {
		Watchered watchered = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		watchered.addWatcher(watcher1);
		watchered.addWatcher(watcher2);
		watchered.addWatcher(watcher3);
		
		watchered.nofifyWatcher("我告诉你们，我被执行了 ！");
		
	}
}
