package cys.gh.lesson4_1.callback;

public class CallBackClass {

	private OnClickLisener onClickLisener;
	
	
	public void setOnClickLisener(OnClickLisener onClickLisener) {
		this.onClickLisener = onClickLisener;
	}

	public void useLisener(){
		if(onClickLisener != null){
			onClickLisener.onClick();
		}
	}
	
	interface OnClickLisener{
		public void onClick();
	}
	
}
