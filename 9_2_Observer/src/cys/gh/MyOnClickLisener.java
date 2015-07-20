package cys.gh;

import java.util.Observable;
import java.util.Observer;


public class MyOnClickLisener implements Observer{

	@Override
	public void update(Observable o, Object event) {
		System.out.println("===========我处理的单击事件===========事件描述event是"+event);
	}
}
