package cys.gh.lessona10_2_swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * swing��awtʹ�û���һ��  �����еĶ��� ��ǰ���ϡ�j�� ��  awt�е�Frame��Ӧ swing�е�JFrame
 */
public class Jframe_1 {

	
	public static void main(String[] args){
		JFrame f = new JFrame("test");
	//	JButton b = new JButton("b");//��ť
	//	f.add(b);
	
		f.setBounds(100,100,100,100);
		/*
		 * jframe�Դ��˹رմ��ڵĹ��ܣ���Ĭ�������ֻ��ʹ������ʧ������û�б��ر�
		 * ����������󣬹رմ��ڵ�ͬʱ������jvm��Ҳ�˳���  ����ִ����System.exit(0);���
		 */
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
