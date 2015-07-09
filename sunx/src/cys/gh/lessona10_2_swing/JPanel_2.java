package cys.gh.lessona10_2_swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanel_2 extends JFrame{
	
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JButton b1 = new JButton("apple");
	JButton b2 = new JButton("bear");
	JButton b3 = new JButton("orange");
	JButton b4 = new JButton("xiba");
	JButton b5 = new JButton("taozi");
	JButton b6 = new JButton("booo");
	
	public JPanel_2(){
		jp1.add(b1);
		jp1.add(b2);
		
		jp2.setLayout(new BorderLayout());
		jp2.add(b3);

		jp3.add(b4);
		jp3.add(b5);
		jp3.add(b6);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.CENTER);
		this.add(jp3,BorderLayout.SOUTH);
		
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanel_2();
	}
}
