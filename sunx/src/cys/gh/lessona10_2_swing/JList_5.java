package cys.gh.lessona10_2_swing;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *���������JComboBox
 *�б�����JList
 *�����������JScrollPane
 */
public class JList_5 extends JFrame {

	JLabel l1,l2;
	JComboBox jc;
	JList jl;
	JPanel p1,p2,p3;
	JScrollPane jsp;
	public JList_5(){
		l1 = new JLabel("��ļ��᣺");
		String[] town = {"����","����","ɽ��"};//�����б�����ʾ�Ķ���
		jc = new JComboBox(town);
		p1 = new JPanel();
		p1.add(l1);
		p1.add(jc);
		
		//����������
		l2 = new JLabel("���εص㣺");
		String[] spot = {"�ʹ�","����","ˮ��","�Ͷ���԰"};
		jl = new JList(spot);
		p2 = new JPanel();
		p2.add(jl);
		
		//��������
		String[] spot2 = {"�ʹ�","����","ˮ��","�Ͷ���԰"};
		jl = new JList(spot);
		jl.setVisibleRowCount(3);
		jsp = new JScrollPane(jl);
		p3 = new JPanel();
		p3.add(jsp);
		
		
		this.setLayout(new GridLayout(3,1));
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.setBounds(100,100,500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JList_5();
	}
}
