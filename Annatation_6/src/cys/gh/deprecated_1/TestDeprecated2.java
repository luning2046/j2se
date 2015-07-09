package cys.gh.deprecated_1;

public class TestDeprecated2 {
	
	//表示关闭过时信息提示警告
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		System.runFinalizersOnExit(true);
	}

}
