package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MouseEvent_8_2 {

	/**
	 * 鼠标响应的事件，这是一个例子程序当在窗口中每次单击鼠标后在单击的位置画出一个圆圈
	 */
	public static void main(String[] args) {
		new MouseFrame();
	}
}

class MouseFrame extends Frame{
	
	private static final long serialVersionUID = 1L;
	//封装圆的集合
	List<Orval> orvals = new ArrayList<Orval>();
	
	public MouseFrame(){
		setBounds(200,200, 300, 300);
		addMouseListener(new MouseMonitor2());
		setVisible(true);
	}
	
	public void paint(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.red);
		for(Orval o : orvals){
			g.drawOval(o.x,o.y, o.width, o.height);
		}
		g.setColor(c);
	}
	
	//MouseAdapter是MouseListener接口的一个适配器类
	class MouseMonitor2 extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			Frame f = (Frame)e.getSource();
			orvals.add(new Orval(e.getX(),e.getY()));//每次单击鼠标都在此时鼠标的坐标上画一个圆
			//每单击鼠标一下  都要重画 Frame窗口
			f.repaint();//MouseFrame.this.repaint()这种方式也可拿到外部类Frame的对象
		}
	}
	
	//这是一个圆的封装类
	class Orval{
		int x,y;//是圆在Frame中的坐标
		final int width=20,height=20;//是圆的大小
		public Orval(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}


