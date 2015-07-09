package cys.gh.lesson2;

/*
 * 创建子类对象时，要在父类的构造方法调用这个类的父类的构造方法。
 * 如果在子类的构造方法中没有显示的调用父类的构造方法
 * 则说明在这个子类的构造方法中隐含的调用了父类的缺省的无参构造方法
 * ；要调用的父类的带参数的构造方法，
 * 则要在子类的构造方法中的第一句
 * 显示的调用这个父类的构造方法-----用super（参数1，参数2）表示父类的构造方法  如 本例中的 super(3);
 * 
 * java不直接支持多继承的原因是：如果多个父类有相同的成员，会产生调用的不确定性  如：
 * class A{
 *    public void show(){}
 * }
 * class B{
 *    public void show(){}
 * }
 * class C extends A,B{
 *     public static void main(String[] args){
 *     		new C().show();//那这个show方法是A的呢还是B的呢？
 *     }
 * }
 */
public class TestExtends {
	public static void main(String[] args){
		new Son();
	}
}
/**
 * 函数覆盖的注意事项
 * 1.子类方法覆盖父类方法时，子类权限必须大于等于父类权限
 * 2.静态方法只能覆盖静态方法
 * 
 * 什么时候使用覆盖操作？
 * 当对一个类进行子类的扩展时，子类需要保留父类的功能声明
 * 但要定义子类中该功能的特有内容时，就使用覆盖操作完成
 * 
 * 为什么类实例化的时候要访问父类的构造方法呢？
 *    因为子类继承了父类，获取到了父类中的属性，所以在使用父类属性之前
 *    要先看父类如何对自己的内容进行初始化的
 */
class Father{
	private int age;
	public Father(int age){
		this.age=age;
	}
	 void speak(){}
}
class Son extends Father{
	public Son(){
		super(3);//显示调用父类的构造有参数构造方法
	}
	void speak(){}
}