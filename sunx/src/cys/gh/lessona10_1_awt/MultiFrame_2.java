package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;

public class MultiFrame_2 {

	/**
	 * 多窗口
	 */
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame(100,100,200,200,Color.blue);
		MyFrame f2 = new MyFrame(300,100,200,200,Color.blue);
	}

}

class MyFrame extends Frame{
	public MyFrame(int x,int y,int w,int h,Color color){
		super("MYFrame test");//设置窗口的标题
		setBounds(x, y, w, h);//窗口大小及显示位置
		setLayout(null);//设置布局管理器
		setVisible(true);
	}
}
