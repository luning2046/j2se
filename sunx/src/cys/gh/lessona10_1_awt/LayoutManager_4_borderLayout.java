package cys.gh.lessona10_1_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class LayoutManager_4_borderLayout {

	/*
	 * ���ֹ����� ֮һborderLayout ����frame��Ĭ�ϲ��ֹ���������
	 */
	public static void main(String[] args){
		Frame f = new Frame("borderlayout");
		Button b1 = new Button("ok");
		Button b2 = new Button("open");
		Button b3 = new Button("close");
		Button b4 = new Button("ckdf");
		Button b5 = new Button("dfe");
		
		f.setLayout(new BorderLayout());//���Բ�����  ��Ϊframe��Ĭ�ϲ��ֹ�����������
		f.add(b1,BorderLayout.SOUTH);
		f.add(b2,BorderLayout.NORTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(200,200);
		f.setVisible(true);
	}
}
