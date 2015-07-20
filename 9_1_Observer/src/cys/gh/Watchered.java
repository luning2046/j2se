package cys.gh;

/**
 * 抽象主题角色  也就是被观察者   相当于 一个button  也就是“事件源”
 *
 */
public interface Watchered {

	public void addWatcher(Watcher watcher);//相当于button的setOnClickListener的方法  也就是注册一个事件处理器
	public void removeWatcher(Watcher watcher);
	
	
	public void nofifyWatcher(String str);//相当于  一个button的单击事件   也就是一个“事件”   参数str相当于是一个事件描述
}
