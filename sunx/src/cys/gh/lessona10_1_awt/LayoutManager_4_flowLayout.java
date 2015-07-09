package cys.gh.lessona10_1_awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class LayoutManager_4_flowLayout {

	/*
	 * 布局管理器 之一flowLayout ：是panel的默认布局管理器类型
	 */
	public static void main(String[] args){
		Frame f = new Frame("flowlayout");
		Button b1 = new Button("ok");
		Button b2 = new Button("open");
		Button b3 = new Button("close");
		
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(100,100);
		f.setVisible(true);
	}
}
