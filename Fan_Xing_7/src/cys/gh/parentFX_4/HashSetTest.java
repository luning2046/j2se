package cys.gh.parentFX_4;

import java.util.HashSet;
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
		overview(ss);
		
		Set<Person<String>> ssp = new HashSet<Person<String>>();
		ssp.add(new Person<String>(324));
		ssp.add(new Person<String>(34));
		ssp.add(new Person<String>(899));
		overview(ssp);
	}
	//����������ֻ�ܽ������������
	public static void overview(Set<?> s){
		for(Object o:s){
			System.out.println(o);
		}
	}
}
