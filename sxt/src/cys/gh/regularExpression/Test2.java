package cys.gh.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args){
		//����ཫϵͳ�ṩ��������ʽ���б��룬�����ڰ����ĵ����г���
		//������ʽ����ʽ ��������Сд��ĸ
		Pattern p = Pattern.compile("\\d{3,5}");
		String s = "123-33445-324-00";
		//�����ַ��Ƿ����������ʽ�����ؽ����װ��Matcher��
		Matcher m=p.matcher(s);
		m.matches();//��ʾm�Ƿ�ƥ��ָ����������ʽ
		m.find();//�ܷ��ҵ�һ����ָ��������ʽƥ����Ӵ� ����boolean
		
		System.out.println(m.matches());
	}
}
