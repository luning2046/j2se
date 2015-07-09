package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 {

	public static void main(String[] args){
		Frame f = new Frame("test");
		Panel p = new Panel(null);
		f.setLayout(null);
		f.setBounds(300,300,500,500);
		f.setBackground(Color.red);
		
		p.setBounds(50,50,300,300);
		p.setBackground(new Color(204,204,233));
		f.add(p);
		f.setVisible(true);
		
	}
}
