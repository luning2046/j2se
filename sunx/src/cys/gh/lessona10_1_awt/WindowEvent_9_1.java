package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * window�¼�  �������ڵ�  ��� ��С��  �ر� ����Ӧ���¼�
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
		//System.out.println("����������ʾ��ʱ�򴥷�");
	}

	public void windowClosed(WindowEvent e) {
		//System.out.println("���ڹرպ󴥷�");
	}

	public void windowClosing(WindowEvent e) {
		//System.out.println("�������ڹر�ʱ����");
	}

	public void windowDeactivated(WindowEvent e) {
		//System.out.println("���ڱ���Ĵ��ڸ��ǵ�ʱ�򴥷�");
	}

	public void windowDeiconified(WindowEvent e) {
		//System.out.println("���ڴ���С���ָ���������ʱ�򴥷�");
	}

	public void windowIconified(WindowEvent e) {
		//System.out.println("������С��ʱ����");
	}

	public void windowOpened(WindowEvent e) {
		//System.out.println("���ڴ򿪵�ʱ�򴥷�");
	}
	
}