package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/*
 *�����¼�
 *һ��С���ӣ������¼��̵�ESC���� ���ڹر�
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