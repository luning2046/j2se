package cys.gh.lessona10_1_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * ActionEvent��Button��ťԪ����Ӧ���¼�
 */
public class ButtonEvent_7_2 {

	/**
	 * �����ص��� �� ��������ťͬʱע��� һ���¼��������
	 * �� ��������������ť�أ�Ĭ�ϸ��ݰ�ť���õ���ʾ��Ϣ������  �籾����b��"press me";b2��press me too
	 * ������ʾ��Ϣ������ͬ��  ��ô�����������أ�
	 * 				��Ҫ�õ���button��һ�������� setActionCommand(String mess);
	 *      		�����¼�������� e.getActionCommand()�Ϳ���ȡ�����ֵ �¼���������
	 *      		�ܱ�� ���ĸ���ť������
	 */
	public static void main(String[] args) {
		Frame f = new Frame("event");
		Button b = new Button("press me");
		Button b2 = new Button("press me");
		b2.setActionCommand("b2 press me");//���ְ�ť
		b.addActionListener(new Monitor2());//����ťע��һ���¼�������
		b2.addActionListener(new Monitor2());//����ťע��һ���¼�������
		f.add(b,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
}
//�¼�������
class Monitor2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed!"+e.getActionCommand());
	}
}
