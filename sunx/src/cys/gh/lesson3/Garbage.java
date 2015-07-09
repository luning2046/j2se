package cys.gh.lesson3;
/*
 * 当栈中的变量指向一个对象类型的数据后 
 * 如Person p=new Person(), p就是栈中变量，而new Person()，就是存在于堆内存中。
 * 当p的生命周期结束p这块内存区域就会自动消失，
 * 此时堆中的这个对象还依然存在（它就是一块垃圾内存了，因为没有引用指向它了），
 * 在某一个时期，堆中的这块内存会被jvm的垃圾收集器清除，释放这块内存。
 */
class Garbage{
	   int  index ;
	   static int count;
	   Garbage(){
	      count++;
	      System.out.println("object"+count+"construct");
	      setId(count);
	}
	void setId(int id)
	{
	  index=id;
	}

	protected void finalize(){  //JVM每次进行垃圾回收操作之前都要调用个重写自java.lang.object类的方法。
	     System.out.println("object "+index+"is reclaimed");
	}
	
	public static void main(String[] args){
	    new Garbage();  //没有定义引用名的实例会被JVM进行垃圾回后操作
	    new Garbage();
	    new Garbage();
	    new Garbage();
	    
	System.gc(); //垃圾回收操作是JVM自动在内存不多的情况下由优先级较低
	}	//的垃圾回收程序完成
	                 //此方法是java.lang.System包中的方法 是给用户程序显示开启的垃圾回收程序的方法
}
