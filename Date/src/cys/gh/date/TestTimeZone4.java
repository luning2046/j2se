package cys.gh.date;


import java.util.TimeZone;

public class TestTimeZone4 {

	/*
	 * TimeZone ���Ǳ�ʾʱ����
	 * 
	 */
	public static void main(String[] args) {
		//��������ϵ�����ʱ��
		String[] ids=TimeZone.getAvailableIDs();
		for(String id : ids){
			System.out.println(id);
		}
		
		//��û������ڵ�Ĭ��ʱ��
		TimeZone t = TimeZone.getDefault();
		System.out.println(t);
		System.out.println(t.getDisplayName());//ʱ����Ϣ���ı���ʾ
		
		
	}

}
