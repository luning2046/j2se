package cys.gh.enum_2;

/*
 * 枚举是一个特殊的类 它可有成员变量 成员方法等 和 类的结构一样，
	但是 枚举的对象的个数是有限的，枚举中定义多少个就有多少个实例对象
 */
public enum Coin {

	/*
	 * 枚举类的有限的对象实例
	 * penny(1) 括号中的1是给构造方法传递参数
	 * 相当于一般类的 new User（“常言颂”）形式
	 * 即相当于 Coin penny = new Coion(1);
	 */
	Penny(1),nickel(5),dime(10),quarter(25);
	
	private int value;//枚举类的成员变量
	
	//枚举类的构造方法
	Coin(int value){
		this.value=value;
	}
	//枚举类的成员方法
	public int getValue(){
		return this.value;
	}
	
	//枚举类也可以有main方法
	public static void main(String[] args){
		//用对象调用方法
		int value = Penny.getValue();
		System.out.println(value);
		
		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
		
		Coin penny = Coin.Penny;
		System.out.println(penny.toString());
	}
}
