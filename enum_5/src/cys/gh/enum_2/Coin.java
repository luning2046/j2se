package cys.gh.enum_2;

/*
 * ö����һ��������� �����г�Ա���� ��Ա������ �� ��Ľṹһ����
	���� ö�ٵĶ���ĸ��������޵ģ�ö���ж�����ٸ����ж��ٸ�ʵ������
 */
public enum Coin {

	/*
	 * ö��������޵Ķ���ʵ��
	 * penny(1) �����е�1�Ǹ����췽�����ݲ���
	 * �൱��һ����� new User���������̡�����ʽ
	 * ���൱�� Coin penny = new Coion(1);
	 */
	Penny(1),nickel(5),dime(10),quarter(25);
	
	private int value;//ö����ĳ�Ա����
	
	//ö����Ĺ��췽��
	Coin(int value){
		this.value=value;
	}
	//ö����ĳ�Ա����
	public int getValue(){
		return this.value;
	}
	
	//ö����Ҳ������main����
	public static void main(String[] args){
		//�ö�����÷���
		int value = Penny.getValue();
		System.out.println(value);
		
		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
		
		Coin penny = Coin.Penny;
		System.out.println(penny.toString());
	}
}
