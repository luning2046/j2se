package cys.gh.date;


import java.util.TimeZone;

public class TestTimeZone4 {

	/*
	 * TimeZone ：是表示时区的
	 * 
	 */
	public static void main(String[] args) {
		//获得世界上的所有时区
		String[] ids=TimeZone.getAvailableIDs();
		for(String id : ids){
			System.out.println(id);
		}
		
		//获得机器所在的默认时区
		TimeZone t = TimeZone.getDefault();
		System.out.println(t);
		System.out.println(t.getDisplayName());//时区信息的文本显示
		
		
	}

}
