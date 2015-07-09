package cys.gh.lessona10_1_awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * 这是一个完成加法功能
 * ActionLisener动作监听器  监听按钮被按下
 */
public class demo_5 {

	public static void main(String[] args){
		new TFFrame();
	}
}
class TFFrame extends Frame{
	TextField input1,input2,result;
	public TFFrame(){
		input1 = new TextField(8);
		input2 = new TextField(8);
		result = new TextField(8);
		Label addLabel=new Label("+");
		Button b = new Button("=");
		b.addActionListener(new MyMonitor());
		this.setLayout(new FlowLayout());
		add(input1);
		add(addLabel);
		add(input2);
		add(b);
		add(result);
		pack();
		setVisible(true);
	}
	//用内部类 完成事件处理
	private class MyMonitor implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			Integer v1 = Integer.parseInt(input1.getText());
			Integer v2 = Integer.parseInt(input2.getText());
			result.setText((v1+v2)+"");
		}
	}
}
