package cys.gh;

import java.text.NumberFormat;

public class NumberFormatTest {

	/**
	 * ���ָ�ʽ��
	 */
	public static void main(String[] args) {
		double d = 1234.56;
		//���ָ�ʽ����
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1.format(d));//�ڱ�����ʽ��ʽ������
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();//ʹ�ñ��ػ��ұ�ʾ��ʽʵ����NumberFormat��
		System.out.println(nf2.format(d));
		
	}
}
