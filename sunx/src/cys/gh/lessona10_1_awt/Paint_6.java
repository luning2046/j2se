package cys.gh.lessona10_1_awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/*
 * ��ͼ
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
	//�����������д�� Frame�ĸ���Container�ķ�����
	//����������Զ����� ����������ڱ�������������ʾ��ʱ���Զ����� 
	//����ν������ʾ����ָ�������ϵ���Ĵ��ڸ������frame���ں��ٴ���ʾ���frame���ڣ�
	@Override
	public void paint(Graphics g) {
		//Graphics����һ������
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50,50,30,30);
		g.setColor(Color.blue);
		g.fillRect(80,80,40,40);
		g.setColor(c);
	}
}
