package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList_1 {

	public static void main(String[] args){
//		List l = new ArrayList();
//		l.add("cys");
//		l.add("gh");
//		l.add("cyy");
//		System.out.println(l.get(10));//Ĭ�ϵ���ÿ��Ԫ�ص�toString������Ԫ�ش�ӡ���
//		Object[] objs = l.toArray();//��List����ת��Ϊһ������
//		for(int i=0;i<objs.length;i++){
//			System.out.println(objs[i]);
//		}
//		
//		List l2 = Arrays.asList(objs);//��һ������ת��Ϊ����
//		System.out.println(l2);//l2������ϴ�ʱ����һ���̶��ߴ�ļ���  ��˲���������������µ�Ԫ����
//		//l2.add("dfj"); �˾������������쳣
		
		testArrayList2();
	}
	
	/**
	 * �������ִ�л�����쳣��
	 * ԭ���ǣ��ڵ��������У���Ҫ���������е�Ԫ�أ����ײ����쳣��
	 * ����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ����ж�Ԫ�ؽ��и����
	 * ����  
	 * testArrayList2()�о���ListIterator������
	 */
	private static void testArrayList(){
		List l = new ArrayList();
		l.add("cys");
		l.add("gh");
		l.add("cyy");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String ele = it.next();//������  �׳�java.util.ConcurrentModificationException
			if(ele.equals("gh")){
				l.add("zyx");
			}else{
				System.out.println("next:"+ele);
			}
		}
		System.out.println(l);
	}
	/**
	 * ListIterator�б������
	 * ������ʵ���ڵ�����������ɶ�Ԫ�ص���ɾ�Ĳ顣
	 * ע�⣺ֻ��List���ϲž߱��õ�������
	 */
	private static void testArrayList2(){
		List l = new ArrayList();
		l.add("cys");
		l.add("gh");
		l.add("cyy");
		ListIterator<String> it = l.listIterator();
		while(it.hasNext()){//it.hasPrevious()
			String ele = it.next();//������  �׳�java.util.ConcurrentModificationException
			if(ele.equals("gh")){
				it.set("zyx");
			}else{
				System.out.println("next:"+ele);
			}
		}
		System.out.println(l);
	}
}
