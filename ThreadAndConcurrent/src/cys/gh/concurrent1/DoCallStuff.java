package cys.gh.concurrent1;

import java.util.concurrent.Callable;


/**
 * 1.实现了Callable，String将是call方法的返回值类型。例子中用了String，但可以是任何Java类。
 * 2: call方法的返回值类型为String，这是和类的定义相对应的。并且可以抛出异常。
 * 3: call方法可以抛出异常，如加重的斜体字所示。
 */
public class DoCallStuff implements Callable {//*1

	private int aInt;

	public DoCallStuff(int aInt) {
		this.aInt = aInt;
	}

	//相当于Runnable中的run方法
	public String call() throws Exception {//*2
		boolean resultOk = false;
		if (aInt == 0) {
			resultOk = true;
		} else if (aInt == 1) {
			while (true) { // infinite loop
				System.out.println("looping....");
				Thread.sleep(3000);
			}
		} else {
			throw new Exception("Callable terminated with Exception!");//*3
		}
		
		if (resultOk) {
			return "Task done.";
		} else {
			return "Task failed";
		}
	}
}
