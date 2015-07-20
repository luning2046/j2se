package cys.gh;

public class Client {

	public static void main(String[] args) {
		Watchered watchered = new ConcreteWatched();//创建一个  事件源    如创建了一个Button
		
		Watcher watcher1 = new ConcreteWatcher();//创建了一个  事件 处理器   如OnClickLisener
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		watchered.addWatcher(watcher1);//注册一个事件处理器    如setOnClickLisener
		watchered.addWatcher(watcher2);
		watchered.addWatcher(watcher3);
		
		watchered.nofifyWatcher("我告诉你们，我被执行了 ！");//事件发生了    如button被单击了
		
	}
}
