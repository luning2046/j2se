package cys.gh;

/**
 * 抽象观察者角色    相当于一个Button事件处理器 如OnClickListener 也就是“事件处理器”
 */
public interface Watcher {

	public void update(String str);
}
