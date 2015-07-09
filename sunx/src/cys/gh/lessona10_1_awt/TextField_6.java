package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField_6 {

	/**
	 *本例是 一个输入文本
	 */
	public static void main(String[] args) {
		Frame f = new Frame("test");
		TextField tf = new TextField();
		f.add(tf);
		tf.addActionListener(new TFActionListener());
		//tf.setEchoChar('*');//设置回显字符  类似表单输入密码的形式
		f.pack();
		f.setVisible(true);
	}
}
class TFActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
}
