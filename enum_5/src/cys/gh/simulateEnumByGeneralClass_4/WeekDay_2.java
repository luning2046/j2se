package cys.gh.simulateEnumByGeneralClass_4;

/*
 * ��ʵ ö�������һ���������  
 * ������һ���������ģ��һ��ö��
 */
public abstract class WeekDay_2 {
	//��Ϊ ö�ٵ�����֮һ���ǣ�
	//   ֻ���й涨��ʵ��  �������ⲿ��㴴�� ���Թ��췽�������private
	private WeekDay_2(){}
	
	//���������ö���ж����ֵ
	public static final WeekDay_2 monday = new WeekDay_2(){
		public WeekDay_2 nextDay(){
			return tuesday;
		 }
	};
	public static final WeekDay_2 tuesday = new WeekDay_2(){
		public WeekDay_2 nextDay(){
			return null;
		 }
	};
	
	
	//�����г�Ա���� ����Ա����
	public abstract WeekDay_2 nextDay();
}
