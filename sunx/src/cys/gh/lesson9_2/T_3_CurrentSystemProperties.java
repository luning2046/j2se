package cys.gh.lesson9_2;

import java.util.Properties;

public class T_3_CurrentSystemProperties {

	/**
	 * �鿴��ǰϵͳ��������Ϣ jvmĬ�ϱ��뷽ʽ��GBK
	 */
	public static void main(String[] args) {
		Properties ps = System.getProperties();//�õ���ǰϵͳ��������Ϣ
		ps.list(System.out);
	}

}
