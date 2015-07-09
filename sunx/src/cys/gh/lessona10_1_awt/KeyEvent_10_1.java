package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 *键盘事件
 */
public class KeyEvent_10_1 {
	public static void main(String[] args){
		Frame f = new Frame("test");
		f.setBounds(100,100,100,100);
		f.addKeyListener(new KeyMonitor());
		f.setVisible(true);
	}
}

class KeyMonitor implements KeyListener{

	public void keyPressed(KeyEvent e) {
		//System.out.println("所有键盘按键被按下的时候都触发  与keyTyped事件不一样");
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println("键盘按键被释放的时候触发");
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("像a,b,1,2,3,',/,这样的字符键按下时触发 ；像F1,shift,ctrl键按下时不触发");
	}
	
}