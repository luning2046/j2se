package cys.gh.lessona10_2_swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
/*
 * 单选钮和复选钮
 */
@SuppressWarnings("serial")
public class Demo_6 extends JFrame {

	JLabel l1,l2;
	JSplitPane jsp;//拆分的Panel 也是一种Panel，让显示区域拆分成两部分
	
	public Demo_6(){
		l1=new JLabel("常言顺");
		l1.setFont(new Font("宋体",Font.PLAIN,16));//设置字体
		l1.setForeground(Color.red);//设置字体颜色
		
		l2=new JLabel(new ImageIcon("img/Winter.jpg"));//引入图片
		
		//参数1表示垂直拆分  ,参数2和参数3两个容器中 所添加的组件
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,l1,l2);
		jsp.setOneTouchExpandable(true);//可隐藏伸缩
		this.add(jsp);
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_6();
	}
}
