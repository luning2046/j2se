package cys.gh.suppressWarnings_3;

import java.util.Date;

/*
 * SuppressWarning:���Թرձ�������ָ����һ�ֻ��������
 * ����ʾ�򾯸湦��
 */
@SuppressWarnings(value={"deprecation"})//��ʾ�رն�ʹ�ù�ʱ�����ľ���
public class TestSuppressWarnings {
	public static void main(String[] args){
		Date d = new Date();
		//ʹ�ù�ʱ����
		int hour = d.getHours();
		System.out.println(hour);
	}
}
