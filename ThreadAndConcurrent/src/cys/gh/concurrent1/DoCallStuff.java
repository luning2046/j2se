package cys.gh.concurrent1;

import java.util.concurrent.Callable;


/**
 * 1.ʵ����Callable��String����call�����ķ���ֵ���͡�����������String�����������κ�Java�ࡣ
 * 2: call�����ķ���ֵ����ΪString�����Ǻ���Ķ������Ӧ�ġ����ҿ����׳��쳣��
 * 3: call���������׳��쳣������ص�б������ʾ��
 */
public class DoCallStuff implements Callable {//*1

	private int aInt;

	public DoCallStuff(int aInt) {
		this.aInt = aInt;
	}

	//�൱��Runnable�е�run����
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
