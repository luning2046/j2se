package cys.gh;

import java.util.Observable;


public class MyButton extends Observable{

	public void onClick(String eventDes){//ģ��һ�������¼�   ����eventDes���¼���������Ϣ
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.setChanged();//��ʾ�¼����Է����ˡ�
		this.notifyObservers(eventDes);//��ʾ�¼������ˣ�֪ͨ�¼�������   �����¼�������   ����MyOnCliclienerִ��
	}
}
