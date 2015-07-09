package cys.gh.simulateEnumByGeneralClass_4;

/*
 * 其实 枚举类就是一个特殊的类  
 * 我们用一个特殊的类模拟一个枚举
 */
public abstract class WeekDay_2 {
	//因为 枚举的特性之一就是：
	//   只能有规定的实例  不能在外部随便创建 所以构造方法定义成private
	private WeekDay_2(){}
	
	//这就是类似枚举中定义的值
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
	
	
	//可以有成员方法 ，成员变量
	public abstract WeekDay_2 nextDay();
}
