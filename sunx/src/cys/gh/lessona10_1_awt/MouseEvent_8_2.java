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
	 * �����Ӧ���¼�������һ�����ӳ����ڴ�����ÿ�ε��������ڵ�����λ�û���һ��ԲȦ
	 */
	public static void main(String[] args) {
		new MouseFrame();
	}
}

class MouseFrame extends Frame{
	
	private static final long serialVersionUID = 1L;
	//��װԲ�ļ���
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
	
	//MouseAdapter��MouseListener�ӿڵ�һ����������
	class MouseMonitor2 extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			Frame f = (Frame)e.getSource();
			orvals.add(new Orval(e.getX(),e.getY()));//ÿ�ε�����궼�ڴ�ʱ���������ϻ�һ��Բ
			//ÿ�������һ��  ��Ҫ�ػ� Frame����
			f.repaint();//MouseFrame.this.repaint()���ַ�ʽҲ���õ��ⲿ��Frame�Ķ���
		}
	}
	
	//����һ��Բ�ķ�װ��
	class Orval{
		int x,y;//��Բ��Frame�е�����
		final int width=20,height=20;//��Բ�Ĵ�С
		public Orval(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}


