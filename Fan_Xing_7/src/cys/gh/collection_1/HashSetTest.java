package cys.gh.collection_1;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * 1.泛型在集合容器中的应用
 */
public class HashSetTest {

	public static void main(String[] args){
		//用泛型指定集合中添加的数据类型只能是String类型
		Set<String> ss = new HashSet<String>();
		ss.add("cys");
		ss.add("33");
		ss.add("gh");
	
		for(String s : ss){
			System.out.println(s);
		}
		
		Map<String,String> m = new Hashtable<String,String>();
		m.put("cys","husband");
		m.put("gh","witf");
		m.put("zyx","mother");
		
		System.out.println(	m.get("cys"));
	}
}
