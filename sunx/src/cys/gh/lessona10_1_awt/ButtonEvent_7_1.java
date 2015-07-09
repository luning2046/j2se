package cys.gh.lessona10_1_awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent_7_1 {

	/**
	 * ActionEvent是Button按钮元素响应的事件
	 */
	public static void main(String[] args) {
		Frame f = new Frame("event");
		Button b = new Button("press me");
		b.addActionListener(new Monitor1());//给按钮注册一个事件监听器
		f.add(b);
		f.pack();
		f.setVisible(true);
	}
}
//事件处理器
class Monitor1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed!");
	}
}
