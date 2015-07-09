package cys.gh.lessona10_2_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * awt��swing��  paint�ϵĲ��
 *   awt�� Frame���Ը��� paint����  swing��JFrame�����Ը����������  ��Ҫ��JPanel�и����������
 *   ��ͼƬ
 */
@SuppressWarnings("serial")
public class DrawImage_7 extends JFrame {

	MyPanel m;
	
	@SuppressWarnings("static-access")
	public DrawImage_7(){
		m=new MyPanel();
		this.add(m);
		this.setBounds(10,10,300,300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawImage_7();
	}
}
@SuppressWarnings("serial")
class MyPanel extends JPanel{
	public void paint(Graphics g){
		Image im = Toolkit.getDefaultToolkit().getImage("img/Winter.jpg");
		g.drawImage(im,80,80,200,150,this);
		
		//���ַ���
		g.setColor(Color.red);
		g.setFont(new Font("����",Font.BOLD,30));
		g.drawString("�������",100,100);
	}
}
