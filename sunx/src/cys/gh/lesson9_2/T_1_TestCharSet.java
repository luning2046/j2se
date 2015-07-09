package cys.gh.lesson9_2;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T_1_TestCharSet {

	/**
	 * 得到当前jvm支持的字符编码集
	 */
	public static void main(String[] args) {
		Map m = Charset.availableCharsets();//得到当前系统的字符编码集
		Set names = m.keySet();
		Iterator iter = names.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
