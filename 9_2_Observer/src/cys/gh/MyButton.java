package cys.gh;

import java.util.Observable;


public class MyButton extends Observable{

	public void onClick(String eventDes){//模拟一个单击事件   参数eventDes是事件的描述信息
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.setChanged();//表示事件可以发生了。
		this.notifyObservers(eventDes);//表示事件发送了，通知事件处理函数   单击事件发送了   触发MyOnClicliener执行
	}
}
