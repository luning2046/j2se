package cys.gh.myselfdefine_fanwei_3;

import java.util.ArrayList;
import java.util.List;

/*
 * �� T ֻ����ĳ��ָ�������ͻ����ָ�����͵�������
 * �涨�� T �����ͷ�Χ
 * ���ֹ������ʽ������extends��ʾ
 */
public class Foo<T extends List> {
	private T f;
	
	
	public T getF() {
		return f;
	}


	public void setF(T f) {
		this.f = f;
	}


	public static void main(String[] args){
		//f1��ָ�������� ֻ����List���ͻ���������
		Foo<ArrayList> f1 = new Foo<ArrayList>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		f1.setF(al);
		ArrayList arrayList = f1.getF();
		System.out.println(arrayList.size());
	}
}
