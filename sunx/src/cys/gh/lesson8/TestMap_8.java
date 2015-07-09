package cys.gh.lesson8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestMap_8 {

	public static void main(String[] args){
		Map<User,Integer> m = new HashMap<User,Integer>();
		m.put(new User(1,"cys"),1);
		m.put(new User(2,"cyy"),3);
		m.put(new User(3,"cqd"),2);
		m.put(new User(4,"zyx"),1);
		
		Collection<User> us1 = m.keySet();
		Collection<Integer> us2 = m.values();
		for(User u : us1){
			System.out.println(u.name);
		}
		for(Integer i : us2){
			System.out.println(i);
		}
		Collection<Map.Entry<User,Integer>> c = m.entrySet();
		for(Map.Entry<User,Integer> me: c){
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
class User{
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}