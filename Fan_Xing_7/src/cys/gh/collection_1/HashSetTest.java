package cys.gh.collection_1;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * 1.�����ڼ��������е�Ӧ��
 */
public class HashSetTest {

	public static void main(String[] args){
		//�÷���ָ����������ӵ���������ֻ����String����
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
