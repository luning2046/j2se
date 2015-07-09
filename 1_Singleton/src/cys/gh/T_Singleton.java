package cys.gh;

public class T_Singleton {

	public static void main(String[] args){
		//在类Singleton加载的时候 就创建了一个对象  在程序执行期间
		//无论多少引用，都是最初加载时创建的那个引用
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1==s2);//true 因为是单例模式
		
	}
}
//单态模式类   饿汉式
class Singleton{
	
	private Singleton(){}
	
	private final static Singleton s = new Singleton();
	
	public static Singleton getInstance(){
		return s;
	}
	
	public void say(){
		System.out.println("一个基本的函数！");
	}
}

//懒汉式  延迟加载
class Singleton2{
	
	private Singleton2(){}
	
	private  static Singleton2 s = null;
	
	public static Singleton2 getInstance(){
		
		synchronized (Singleton2.class) {
			if(s==null){
				s = new Singleton2();
			}
		}
		
		return s;
	}
	
	public void say(){
		System.out.println("一个基本的函数！");
	}
}