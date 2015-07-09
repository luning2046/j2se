package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/*
 * 画图
 */
public class Paint_6 {

	public static void main(String[] args){
		new PaintFrame();
	}
}
class PaintFrame extends Frame{

	public PaintFrame(){
		setBounds(200,200,640,480);
		setVisible(true);
	}
	//这个方法是重写了 Frame的父类Container的方法，
	//这个方法被自动调用 ：在这个窗口被创建或被重新显示的时候被自动调用 
	//（所谓重新显示：是指在桌面上当别的窗口覆盖这个frame窗口后，再次显示这个frame窗口）
	@Override
	public void paint(Graphics g) {
		//Graphics就是一个画笔
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,30,30);
		g.setColor(Color.blue);
		g.fillRect(80,80,40,40);
		g.setColor(c);
	}
}
