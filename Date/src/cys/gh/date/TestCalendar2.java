package cys.gh.date;

import java.util.Calendar;


public class TestCalendar2 {

	/*
	 * Calendar��1���ָ�����ڵ��·ݵȵķ����� 
	 * 			 2�ܽ������ڵ����㣨����˼�������һ��ȵȣ�
	 * 
	 */
	public static void main(String[] args) throws Exception {
		//���ַ�ʽ����һ������ ����ȡ��ǰʱ��
		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1);
//		c1.add(Calendar.YEAR,10);//�������10������һ��
//		c1.add(Calendar.DAY_OF_WEEK,3);//�����
		
		
		System.out.println(c1.get(Calendar.YEAR));//��ȡ��
		System.out.println(c1.get(Calendar.MONTH));//��ȡ�£�ע����0��ʾһ��...��
		System.out.println(c1.get(Calendar.DATE));//��ȡ����
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));//��ȡʱ
		System.out.println(c1.get(Calendar.MINUTE));//��ȡ��
		System.out.println(c1.get(Calendar.SECOND));//��ȡ��
		System.out.println(c1.get(Calendar.AM_PM));//�����绹������ ���緵��0���緵��1
		
		System.out.println(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));//������µĵڼ���
		System.out.println("--"+c1.get(Calendar.DAY_OF_WEEK));//�����ܵĵڼ���
//		c1.set(2001,5,2);//ָ��һ������
//		
//		System.out.println("====="+dayForWeek(""));
//		c1.setTimeInMillis(System.currentTimeMillis());
//		System.out.println(c1);
		
//		   Calendar c = Calendar.getInstance();
//         c.set(Calendar.HOUR_OF_DAY, 5);//ֻ�ǰѵ�ǰ���ڵ�  ��ʱ������Ϊ5��
//         c.set(Calendar.MINUTE, 34);//ֻ�ǰѵ�ǰ���ڵ�  ���֡�����Ϊ34��  ����ʱ���ֶβ���  ��  �꣬��
System.out.println("--"+(c1.get(Calendar.DAY_OF_WEEK)+5)%7);//�����ܵĵڼ���
		
	}
	
	public static int dayForWeek(String pTime) throws Exception {  
		 Calendar c = Calendar.getInstance();  
//		 c.setTime(format.parse(pTime));  
		 int dayForWeek = 0;  
		 if(c.get(Calendar.DAY_OF_WEEK) == 1){  
		  dayForWeek = 7;  
		 }else{  
		  dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;  
		 }  
		 return dayForWeek;  
	} 
}