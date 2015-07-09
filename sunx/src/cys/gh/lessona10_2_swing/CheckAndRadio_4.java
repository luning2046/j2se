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
 * 单选钮和复选钮
 */
@SuppressWarnings("serial")
public class CheckAndRadio_4 extends JFrame {

	JPanel p1,p2,p3;
	JLabel l1,l2;
	JButton b1,b2;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2;
	//单选按钮必须放在 一个ButtonGroup中
	ButtonGroup bg;
	public CheckAndRadio_4(){
		l1 = new JLabel("你的兴趣爱好：");
		l2 = new JLabel("你的性别：");
		cb1 = new JCheckBox("足球");
		cb2 = new JCheckBox("网球");
		cb3 = new JCheckBox("蓝球");
		rb1 = new JRadioButton("男");
		rb2 = new JRadioButton("女");
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b1 = new JButton("注册");
		b2 = new JButton("取消");
		
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
