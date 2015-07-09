package cys.gh.lesson8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hashTabel �� hashMap�������ǣ�ǰ�����̰߳�ȫ��  �������̲߳���ȫ��
public class TestHashMap_7 {
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("one","cys");
		hm.put("two","cyy");
		hm.put("three","gh");
		
		Collection c = hm.values();//���key-value���� value�ļ���
		print(c);
		
		Set<String> s = hm.keySet();//���key-value����key�ļ���
		print(s);
		
		Set s2 = hm.entrySet();//���key-value�Եļ���
		Iterator it = s2.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

	public static void print(Collection c){
		Iterator<String> iter = c.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
