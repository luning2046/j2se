package cys.gh;

public class Client {

	public static void main(String[] args) {
		
		MyButton b = new MyButton();
		
		MyOnClickLisener listenre = new MyOnClickLisener();
		b.addObserver(listenre);
		
		b.onClick("���ǵ����¼�");
	}
}
