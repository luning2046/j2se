package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;

public class MultiFrame_2 {

	/**
	 * �ര��
	 */
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame(100,100,200,200,Color.blue);
		MyFrame f2 = new MyFrame(300,100,200,200,Color.blue);
	}

}

class MyFrame extends Frame{
	public MyFrame(int x,int y,int w,int h,Color color){
		super("MYFrame test");//���ô��ڵı���
		setBounds(x, y, w, h);//���ڴ�С����ʾλ��
		setLayout(null);//���ò��ֹ�����
		setVisible(true);
	}
}
