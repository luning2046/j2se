package cys.gh;
/*
 * ThreadLocal:是一个集合 ，
 * 放入其中的资源被这一个线程的所有代码部分共享
 * http://blog.csdn.net/abing37/article/details/4460298
 */
public class TestThreadLocal {

	public static void main(String[] args){
		
		new ThreadLocalTest().start();
		
	}
}
class ThreadLocalTest extends Thread{
	
	public void run() {
		new Part1().aa("cys");
		System.out.println(new Part2().bb());
	}
}

class ShareThreadLocal{
	public static ThreadLocal<String> tl = new ThreadLocal<String>();
	public static void put(String str){
		tl.set(str);
	}
	public static String get(){
		return tl.get();
	}
}
class Part1{
	public void aa(String str){
		ShareThreadLocal.put(str);
	}
}
class Part2{
	public String bb(){
		return ShareThreadLocal.get();
	}
}


