package cys.gh.lesson8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//hashTabel 与 hashMap的区别是：前者是线程安全的  后者是线程不安全的
public class TestHashMap_7 {
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("one","cys");
		hm.put("two","cyy");
		hm.put("three","gh");
		
		Collection c = hm.values();//获得key-value对中 value的集合
		print(c);
		
		Set<String> s = hm.keySet();//获得key-value对中key的集合
		print(s);
		
		Set s2 = hm.entrySet();//获得key-value对的集合
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
