package cys.gh.lesson8;

import java.util.LinkedList;

/**
 * 用linkedlist 模拟一个 数据结构--栈
 */
public class TestStack_3 {
	
	private LinkedList ll = new LinkedList();
	
	//把添加的元素放入集合的头部
	public void push(Object o){
		ll.addFirst(o);
	}
	//把集合中的第一个元素返回并删除
	public Object pop(){
		return ll.removeFirst();
	}
	//得到栈顶元素
	public Object peek(){
		return ll.getFirst();
	}
	//判断集合是否为空
	public boolean empty(){
		return ll.isEmpty();
	}
	
	public static void main(String[] args) {
		TestStack_3 ms = new TestStack_3();
		ms.push("cys");
		ms.push("gh");
		ms.push("cyy");
		
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.empty());
	}
}
