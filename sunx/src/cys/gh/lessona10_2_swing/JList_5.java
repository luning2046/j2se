package cys.gh.lessona10_2_swing;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *下拉框组件JComboBox
 *列表框组件JList
 *滚动窗口组件JScrollPane
 */
public class JList_5 extends JFrame {

	JLabel l1,l2;
	JComboBox jc;
	JList jl;
	JPanel p1,p2,p3;
	JScrollPane jsp;
	public JList_5(){
		l1 = new JLabel("你的籍贯：");
		String[] town = {"北京","辽宁","山东"};//下拉列表中显示的东西
		jc = new JComboBox(town);
		p1 = new JPanel();
		p1.add(l1);
		p1.add(jc);
		
		//不带滚动条
		l2 = new JLabel("旅游地点：");
		String[] spot = {"故宫","长城","水库","劳动公园"};
		jl = new JList(spot);
		p2 = new JPanel();
		p2.add(jl);
		
		//带滚动条
		String[] spot2 = {"故宫","长城","水库","劳动公园"};
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
