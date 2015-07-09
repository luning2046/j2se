package cys.gh.parentFX_4;

import java.util.HashSet;
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
		overview(ss);
		
		Set<Person<String>> ssp = new HashSet<Person<String>>();
		ssp.add(new Person<String>(324));
		ssp.add(new Person<String>(34));
		ssp.add(new Person<String>(899));
		overview(ssp);
	}
	//这种情形下只能进行输出操作。
	public static void overview(Set<?> s){
		for(Object o:s){
			System.out.println(o);
		}
	}
}
