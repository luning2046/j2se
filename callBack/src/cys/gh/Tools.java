package cys.gh;

/*
 * 在Java中，通常就是编写另外一个类或类库的人规定一个接口（本例的CallBack接口），
 * 然后你来实现这个接口（通过匿名类new CallBack语句实现了接口CallBack），
 * 然后把这个实现类的一个对象作为参数传给别人的程序（CallBack接口传递给了函数testTime()），
 * 别人的程序必要时就会通过那个接口来调用你编写的函数。(callBack.execute()调用的接口的函数)
 * 
 * 本例是统计一个函数的执行时间的
 */
public class Tools {

	/*
	 * 在这函数中的程序片段执行到某个语句时，调用另一个函数，这个函数叫做回调函数
	 * 本例中execute是一个回调函数   这个函数注册给了testTime函数
	 */
	public void testTime(CallBack callBack){
		long begin = System.currentTimeMillis();
		callBack.execute();
		long end = System.currentTimeMillis();
		System.out.println("function run time :"+(end-begin)+"毫秒");
	}
	
	public static void main(String[] args){
		
		Tools tool = new Tools();
		
		//给函数testTime注册一个回调函数
		tool.testTime(new CallBack(){

			@Override
			public void execute() {//这样使用的好处是  execute的具体实现是可以自定义的
				
				for(int i=0;i<100000000;i++){
					
				}
			}
			
		});
	}
}
