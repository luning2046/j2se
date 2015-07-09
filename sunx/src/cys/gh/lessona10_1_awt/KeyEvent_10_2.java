package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/*
 *键盘事件
 *一个小例子，当按下键盘的ESC键是 窗口关闭
 */
public class KeyEvent_10_2 {
	public static void main(String[] args){
		Frame f = new Frame("test");
		f.setBounds(100,100,100,100);
		f.addKeyListener(new KeyMonitor2());
		f.setVisible(true);
	}
}

class KeyMonitor2 extends KeyAdapter{

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(keyCode==27){
			System.exit(0);
		}
	}
}