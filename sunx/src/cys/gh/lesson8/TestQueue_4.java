package cys.gh.lesson8;

import java.util.LinkedList;

/**
 * ��linkedlist ģ��һ�� ���ݽṹ--����
 */
public class TestQueue_4 {
	
	private LinkedList ll = new LinkedList();
	
	public void put(Object o){
		ll.addLast(o);
	}
	
	public Object get(){
		return ll.removeFirst();
	}
	
	public boolean empty(){
		return ll.isEmpty();
	}
	public static void main(String[] args) {
		TestQueue_4 tq = new TestQueue_4();
		tq.put("cys");
		tq.put("gh");
		System.out.println(tq.get());
		System.out.println(tq.get());
	}

}
