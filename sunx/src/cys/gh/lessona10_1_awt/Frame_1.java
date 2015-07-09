package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;

public class Frame_1 {

	public static void main(String[] args){
		Frame f = new Frame("first awt");
		f.setLocation(300,300);
		f.setSize(170,100);
		f.setBackground(Color.green);
		f.setResizable(false);//不能改变窗口的大小
		f.setVisible(true);
	}
}
