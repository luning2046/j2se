package cys.gh.lesson7.concurrent;

import java.util.concurrent.atomic.AtomicInteger;


public class T00_atomicInteger {

	/**
	 * AtomicInteger 就是代表一个整数
	 * 特殊性：就是自动实现了异步操作的整数
	 * 也就是  多个线程对这个整数进行加减等操作  都是线程安全的
	 */
	public static void main(String[] args) {
		AtomicInteger tickets = new AtomicInteger(100);
		
	}


}
