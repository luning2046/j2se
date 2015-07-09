package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_8_1 {

	/**
	 * �����Ӧ���¼�
	 */
	public static void main(String[] args) {
		Frame f = new Frame("mouse");
		f.setBounds(300,300,500,500);
		f.addMouseListener(new MouseMonitor());
		f.setVisible(true);
	}
}
class MouseMonitor implements MouseListener{
	//���������Ӧ
	public void mouseClicked(MouseEvent e) {
		//System.out.println("mouseClicked");
	}
	//��������Ӧ������Ӧ
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}
	//����˳���Ӧ������Ӧ
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
	//��갴����Ӧ
	public void mousePressed(MouseEvent e) {
		//System.out.println("mousePressed");
	}
	//��굯����Ӧ
	public void mouseReleased(MouseEvent e) {
		//System.out.println("mouseReleased");
	}
}
