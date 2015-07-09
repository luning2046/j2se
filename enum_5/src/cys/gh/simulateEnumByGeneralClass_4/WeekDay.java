package cys.gh.simulateEnumByGeneralClass_4;

/*
 * 其实 枚举类就是一个特殊的类  
 * 我们用一个特殊的类模拟一个枚举
 */
public  class WeekDay {
	//因为 枚举的特性之一就是：
	//   只能有规定的实例  不能在外部随便创建 所以构造方法定义成private
	private WeekDay(){}
	
	//这就是类似枚举中定义的值
	public static final WeekDay monday = new WeekDay();
	public static final WeekDay tuesday = new WeekDay();
	public static final WeekDay wednesday = new WeekDay();
	public static final WeekDay thursday = new WeekDay();
	public static final WeekDay friday = new WeekDay();
	public static final WeekDay saturday= new WeekDay();
	public static final WeekDay sunday = new WeekDay();
	
	//可以有成员方法 ，成员变量
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
