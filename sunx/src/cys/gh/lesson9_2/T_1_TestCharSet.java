package cys.gh.lesson9_2;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T_1_TestCharSet {

	/**
	 * �õ���ǰjvm֧�ֵ��ַ����뼯
	 */
	public static void main(String[] args) {
		Map m = Charset.availableCharsets();//�õ���ǰϵͳ���ַ����뼯
		Set names = m.keySet();
		Iterator iter = names.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
