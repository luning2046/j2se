package cys.gh;

import java.util.Observable;
import java.util.Observer;


public class MyOnClickLisener implements Observer{

	@Override
	public void update(Observable o, Object event) {
		System.out.println("===========�Ҵ���ĵ����¼�===========�¼�����event��"+event);
	}
}
