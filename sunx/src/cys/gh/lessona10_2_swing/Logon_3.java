package cys.gh.lessona10_2_swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logon_3 extends JFrame{

	/**
	 * 用户登录页
	 */
	JPanel p1,p2,p3;
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t;
	JPasswordField pass;
	public Logon_3(){
		l1 = new JLabel("姓名：");
		t = new JTextField(8);
		p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(l1);
		p1.add(t);
		
		l2 = new JLabel("密码：");
		pass = new JPasswordField(8);
		p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(l2);
		p2.add(pass);
		
		b1 = new JButton("确定");
		b2 = new JButton("取消");
		p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.CENTER));
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
	
	public static void main(String[] args) {
		new Logon_3();
	}

}
