package cys.gh.lesson8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class TestProperties_7_2 {

	/**
	 * ����һ��.properties�����ļ�
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pps = new Properties();
		InputStream in = new FileInputStream("/aa.properties");//��ʾ��ǰ�ļ����µ��ļ�
		pps.load(in);//��ʾ��ǰ�ļ����µ��ļ�
		
		//��ʾ��classpath��Ŀ¼��������ļ�
		//InputStream in = TestProperties_7_2.class.getClassLoader().getResourceAsStream("aa.properties");
		
		Enumeration en = pps.propertyNames();
		while(en.hasMoreElements()){
			String strKey = (String)en.nextElement();
			String strValue=pps.getProperty(strKey);
			
			System.out.println(strKey+"="+strValue);
		}
	}

}