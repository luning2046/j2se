package cys.gh.lessona10_2_swing;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/*
 * ��ѡť�͸�ѡť
 */
@SuppressWarnings("serial")
public class CheckAndRadio_4 extends JFrame {

	JPanel p1,p2,p3;
	JLabel l1,l2;
	JButton b1,b2;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2;
	//��ѡ��ť������� һ��ButtonGroup��
	ButtonGroup bg;
	public CheckAndRadio_4(){
		l1 = new JLabel("�����Ȥ���ã�");
		l2 = new JLabel("����Ա�");
		cb1 = new JCheckBox("����");
		cb2 = new JCheckBox("����");
		cb3 = new JCheckBox("����");
		rb1 = new JRadioButton("��");
		rb2 = new JRadioButton("Ů");
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b1 = new JButton("ע��");
		b2 = new JButton("ȡ��");
		
		p1 = new JPanel();
		p1.add(l1);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p2 = new JPanel();
		p2.add(l2);
		p2.add(rb1);
		p2.add(rb2);
		p3 = new JPanel();
		p3.add(b1);
		p3.add(b2);
		this.setLayout(new GridLayout(3,1));
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new CheckAndRadio_4();
	}
}
