package cys.gh.lesson2;

/**
 * this变量测试 
 * 一个类当被实例化后  jvm就会默认将这个this指向这个对象
 * 如本例中 this等价于一个new ThisTest();
 * 而在类中一个方法调用另一个方法或使用一个成员变量时，每个方法或成员变量前都默认的加上了"this."前缀（在类内部省略了这个前最） 
 *   如test2调用test3方法test3就显示的加上了“this.”前缀
 */
@SuppressWarnings("unused")
public class ThisTest {
	
	
	/**
	 * 静态变量与成员变量的重要区别：
	 * 1.两个变量的生命周期不同：
	 *    成员变量随着对象的创建而存在，随着对象的被回收而释放
	 *    静态变量随着类的加载而存在，随着类的消失而消失（一般jvm退出的时候类消失）
	 * 2.数据存储的位置不同
	 *    成员变量数据存储在“堆内存”的对象中，所以也叫对象的特有数据
	 *    静态变量数据存储在  “方法区也叫共享数据区”的静态区中。
	 *    
	 * 什么时候使用静态成员变量
	 *    1.当分析对象中所具备的成员变量的值都是相同的。
	 *    2.只要数据在对象中都是不同的，就是对象的特有数据，必须存储在对象中，是非静态的
	 *    3.如果是相同的数据，对象不需要做修改，只需要使用即可，不需要存储在对象中，定义成静态的
	 * 什么时候使用静态方法
	 *    就看该方法是否访问到对象中的特有数据（即非静态成员变量），若是将该方法定成非静态方法，否则 
	 */
	private int age;
	public String name;
	//静态变量先于对象存在，随着类的加载就已经存在了
	public static String password;
	
	public void test(){}
	
	private void test2(){
		this.test3();//this 等价于一个new ThisTest();
		new ThisTest();//一个类中ThisTest中可以使用这个类的对象 new ThisTest()
	}
	
	
	//静态变量中不能使用this，因为this就是该类的一个对象 所以不调用静态方法
	public static void test3(){
		
	}
	//入口函数可以定义在任意类中
	public static void main(String[] args){
//		new ThisTest().age=1;//因为这个入口函数定义在ThisTest类中 所以可以引用private成员
		System.out.println(password);
	}
}
