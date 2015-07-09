package cys.gh.simulateEnumByGeneralClass_4;

/*
 * ��ʵ ö�������һ���������  
 * ������һ���������ģ��һ��ö��
 */
public  class WeekDay {
	//��Ϊ ö�ٵ�����֮һ���ǣ�
	//   ֻ���й涨��ʵ��  �������ⲿ��㴴�� ���Թ��췽�������private
	private WeekDay(){}
	
	//���������ö���ж����ֵ
	public static final WeekDay monday = new WeekDay();
	public static final WeekDay tuesday = new WeekDay();
	public static final WeekDay wednesday = new WeekDay();
	public static final WeekDay thursday = new WeekDay();
	public static final WeekDay friday = new WeekDay();
	public static final WeekDay saturday= new WeekDay();
	public static final WeekDay sunday = new WeekDay();
	
	//�����г�Ա���� ����Ա����
	public WeekDay nextDay(){
		if(this==monday){
			return tuesday;
		}
		return null;
	}
	
	public String toString(){
		return this==monday?"monday":"";
	}
}
