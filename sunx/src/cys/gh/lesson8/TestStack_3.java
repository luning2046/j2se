package cys.gh.lesson8;

import java.util.LinkedList;

/**
 * ��linkedlist ģ��һ�� ���ݽṹ--ջ
 */
public class TestStack_3 {
	
	private LinkedList ll = new LinkedList();
	
	//����ӵ�Ԫ�ط��뼯�ϵ�ͷ��
	public void push(Object o){
		ll.addFirst(o);
	}
	//�Ѽ����еĵ�һ��Ԫ�ط��ز�ɾ��
	public Object pop(){
		return ll.removeFirst();
	}
	//�õ�ջ��Ԫ��
	public Object peek(){
		return ll.getFirst();
	}
	//�жϼ����Ƿ�Ϊ��
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
