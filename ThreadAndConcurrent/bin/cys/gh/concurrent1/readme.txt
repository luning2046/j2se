这个包中是concurrent方式

1：三个新加的多线程包
   Java 5.0里新加入了三个多线程包：
	   java.util.concurrent, 
	   java.util.concurrent.atomic, 
	   java.util.concurrent.locks. 

	java.util.concurrent包含了常用的多线程工具，是新的多线程工具的主体。 
	java.util.concurrent.atomic包含了不用加锁情况下就能改变值的原子变量，
	比如说AtomicInteger提供了addAndGet()方法。
	Add和Get是两个不同的操作，为了保证别的线程不干扰，以往的做法是先锁定共享的变量，然后在锁定的范围内进行两步操作。
	但用AtomicInteger.addAndGet()就不用担心锁定的事了，其内部实现保证了这两步操作是在原子量级发生的，不会被别的线程干扰。 
	java.util.concurrent.locks包包含锁定的工具。



2：Callable 和 Future接口
	   Callable是类似于Runnable的接口，实现Callable接口的类和实现Runnable的类都是可被其它线程执行的任务。
	   Callable和Runnable有几点不同：
	
	Callable规定的方法是call()，而Runnable规定的方法是run(). 
	Callable的任务执行后可返回值，而Runnable的任务是不能返回值的。 
	call（）方法可抛出异常，而run（）方法是不能抛出异常的。 
	运行Callable任务可拿到一个Future对象，通过Future对象可了解任务执行情况，可取消任务的执行，还可获取任务执行的结果。 
