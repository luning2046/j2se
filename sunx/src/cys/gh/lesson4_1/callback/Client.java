package cys.gh.lesson4_1.callback;

import cys.gh.lesson4_1.callback.CallBackClass.OnClickLisener;

public class Client {

	public static void main(String[] args) {
		
		CallBackClass cbc = new CallBackClass();
		
		cbc.setOnClickLisener(new OnClickLisener() {
			@Override
			public void onClick() {
				System.out.println("============callback=================");
			}
		});
		
		
		
		class OnClickLisenerImpl implements OnClickLisener{ 
			@Override
			public void onClick() {
				
			}
			
		}
		OnClickLisenerImpl oni = new OnClickLisenerImpl();
		cbc.setOnClickLisener(oni);
		
		
	}
	
	
}
