package cys.gh.lesson7.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 这个一个面试题
 * 设计一个缓存系统
 */
public class T05_CacheDemo {

	private Map<String, Object> cache = new HashMap<String, Object>();
	public static void main(String[] args) {

	}

	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	/**
	 * 分析这个方法的使用场景
	 * 两个线程  t1 t2
	 *  场景：1 t1执行到 a句 上锁，然后进入并继续执行后续代码，执行到d句时，
	 *     由于value为空 ，因此后续代码要修改共享资源cache了，此时，解开写锁（e句）
	 *     上写锁（f句）。然后执行到g句，t1暂停。
	 *     2 这时t2 执行  执行到a句是，一看当前锁  出于写状态  那么t2就暂停了。如没有a句，t2是不知道当前代码上锁了而且
	 *     也就没法知道锁的状态的
	 *   
	 */
	public  Object getData(String key){
		rwl.readLock().lock();//a
		Object value = null;//b
		try{
			value = cache.get(key);//c
			if(value == null){//d
				rwl.readLock().unlock();//e
				rwl.writeLock().lock();//f
				try{
					if(value==null){//g
						value = "aaaa";//实际失去queryDB();
					}
				}finally{
					rwl.writeLock().unlock();//h
				}
				rwl.readLock().lock();//i
			}
		}finally{
			rwl.readLock().unlock();//j
		}
		return value;
	}
}