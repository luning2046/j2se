package cys.gh.lessona10_2_swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * swing和awt使用基本一样  ，所有的对象 名前加上“j” 如  awt中的Frame对应 swing中的JFrame
 */
public class Jframe_1 {

	
	public static void main(String[] args){
		JFrame f = new JFrame("test");
	//	JButton b = new JButton("b");//按钮
	//	f.add(b);
	
		f.setBounds(100,100,100,100);
		/*
		 * jframe自带了关闭窗口的功能，但默认情况下只是使窗口消失，程序被没有被关闭
		 * 有了这句代码后，关闭窗口的同时，程序（jvm）也退出了  类似执行了System.exit(0);语句
		 */
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
