package cys.gh.lessona10_1_awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class LayoutManager_4_gridLayout {

	/*
	 * ���ֹ����� ֮һborderLayout ����񲼾ֹ�����
	 */
	public static void main(String[] args){
		Frame f = new Frame("gridlayout");
		Button b1 = new Button("a");
		Button b2 = new Button("b");
		Button b3 = new Button("c");
		Button b4 = new Button("d");
		Button b5 = new Button("e");
		Button b6 = new Button("f");
		f.setLayout(new GridLayout(3,2));//����6�����
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.pack();
		f.setVisible(true);
	}
}
