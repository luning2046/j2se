package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField_6 {

	/**
	 *������ һ�������ı�
	 */
	public static void main(String[] args) {
		Frame f = new Frame("test");
		TextField tf = new TextField();
		f.add(tf);
		tf.addActionListener(new TFActionListener());
		//tf.setEchoChar('*');//���û����ַ�  ���Ʊ������������ʽ
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
