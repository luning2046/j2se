package cys.gh.lessona10_2_swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
/*
 * ��ѡť�͸�ѡť
 */
@SuppressWarnings("serial")
public class Demo_6 extends JFrame {

	JLabel l1,l2;
	JSplitPane jsp;//��ֵ�Panel Ҳ��һ��Panel������ʾ�����ֳ�������
	
	public Demo_6(){
		l1=new JLabel("����˳");
		l1.setFont(new Font("����",Font.PLAIN,16));//��������
		l1.setForeground(Color.red);//����������ɫ
		
		l2=new JLabel(new ImageIcon("img/Winter.jpg"));//����ͼƬ
		
		//����1��ʾ��ֱ���  ,����2�Ͳ���3���������� ����ӵ����
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,l1,l2);
		jsp.setOneTouchExpandable(true);//����������
		this.add(jsp);
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_6();
	}
}
