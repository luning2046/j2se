package cys.gh.lessona10_1_awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//关闭窗口
public class WindowEvent_9_2 {

	public static void main(String[] args){
		new CloseFrame();
	}
}
class CloseFrame extends Frame{
	public CloseFrame(){
		this.setBounds(100,100,100,100);
		
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				//setVisible(false);
				System.exit(0);//0正常退出程序  -1异常退出程序
			}
		});
		
		setVisible(true);
	}
}