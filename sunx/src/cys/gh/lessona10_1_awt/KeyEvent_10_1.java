package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 *�����¼�
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
		//System.out.println("���м��̰��������µ�ʱ�򶼴���  ��keyTyped�¼���һ��");
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println("���̰������ͷŵ�ʱ�򴥷�");
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("��a,b,1,2,3,',/,�������ַ�������ʱ���� ����F1,shift,ctrl������ʱ������");
	}
	
}