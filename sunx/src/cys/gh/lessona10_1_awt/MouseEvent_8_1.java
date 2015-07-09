package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_8_1 {

	/**
	 * 鼠标响应的事件
	 */
	public static void main(String[] args) {
		Frame f = new Frame("mouse");
		f.setBounds(300,300,500,500);
		f.addMouseListener(new MouseMonitor());
		f.setVisible(true);
	}
}
class MouseMonitor implements MouseListener{
	//单击鼠标响应
	public void mouseClicked(MouseEvent e) {
		//System.out.println("mouseClicked");
	}
	//鼠标进入响应区域响应
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}
	//鼠标退出响应区域响应
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
	//鼠标按下响应
	public void mousePressed(MouseEvent e) {
		//System.out.println("mousePressed");
	}
	//鼠标弹起响应
	public void mouseReleased(MouseEvent e) {
		//System.out.println("mouseReleased");
	}
}
