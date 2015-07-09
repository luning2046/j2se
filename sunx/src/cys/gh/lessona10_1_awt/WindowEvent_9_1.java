package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * window事件  单击窗口的  最大化 最小化  关闭 是响应的事件
 * 
 */
public class WindowEvent_9_1 {
	public static void main(String[] args){
		new windowFrame1();
	}
}
class windowFrame1 extends Frame{
	public windowFrame1(){
		this.setBounds(100,100,200,200);
		addWindowListener(new windowMonitor1());
		setVisible(true);
	}
}
class windowMonitor1 implements WindowListener{

	public void windowActivated(WindowEvent e) {
		//System.out.println("窗口重新显示的时候触发");
	}

	public void windowClosed(WindowEvent e) {
		//System.out.println("窗口关闭后触发");
	}

	public void windowClosing(WindowEvent e) {
		//System.out.println("窗口正在关闭时触发");
	}

	public void windowDeactivated(WindowEvent e) {
		//System.out.println("窗口被别的窗口覆盖的时候触发");
	}

	public void windowDeiconified(WindowEvent e) {
		//System.out.println("窗口从最小化恢复到正常的时候触发");
	}

	public void windowIconified(WindowEvent e) {
		//System.out.println("窗口最小化时触发");
	}

	public void windowOpened(WindowEvent e) {
		//System.out.println("窗口打开的时候触发");
	}
	
}