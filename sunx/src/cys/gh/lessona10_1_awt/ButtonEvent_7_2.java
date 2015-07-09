package cys.gh.lessona10_1_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * ActionEvent是Button按钮元素响应的事件
 */
public class ButtonEvent_7_2 {

	/**
	 * 本例重点是 ： 有两个按钮同时注册给 一个事件处理程序
	 * 那 怎样区分两个按钮呢？默认根据按钮设置的显示信息来区分  如本例的b的"press me";b2的press me too
	 * 但是显示信息可以相同的  那么又怎样区分呢？
	 * 				需要用到的button的一个方法了 setActionCommand(String mess);
	 *      		这样事件处理程序 e.getActionCommand()就可以取出这个值 事件处理程序就
	 *      		能辨别 是哪个按钮触发的
	 */
	public static void main(String[] args) {
		Frame f = new Frame("event");
		Button b = new Button("press me");
		Button b2 = new Button("press me");
		b2.setActionCommand("b2 press me");//区分按钮
		b.addActionListener(new Monitor2());//给按钮注册一个事件监听器
		b2.addActionListener(new Monitor2());//给按钮注册一个事件监听器
		f.add(b,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
}
//事件处理器
class Monitor2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("a button has been pressed!"+e.getActionCommand());
	}
}
