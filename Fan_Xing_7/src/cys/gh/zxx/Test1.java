package cys.gh.zxx;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * û��ʹ�÷������
		 *  1 ��ִ�е���18�����ʱ�����벻�����ִ��ʱ����classCastException�쳣
		 *   �����������ԭ�򣬾������򼯺������Ԫ��ʱ��û��ָ��Ԫ�����ͣ�����Object����
		 *   ����ڴӼ�����ȥ����ʱ����Ҫ��������ת��������ʱ��ͨ����ִ��ʱ�Ϳ������쳣
		 */
		ArrayList al = new ArrayList();
		al.add(1);//��0��Ԫ��
		al.add(1L);//��1��Ԫ��
		al.add("aa");//��2��Ԫ��
		int i = (Integer)al.get(2);//ȡ��2��Ԫ�أ�������ִ�е������ʱҪ���쳣����ΪString���Ͳ���תΪint����
		
		/*
		 *ʹ�÷��;Ϳɽ�����������
		 *	��������ȷ�˼�����ֻ�ܴ��Integer���͵����ݣ�Ҫ�Ǵ���������͵�����
		 *	�ͻ��ڱ����� ������ͨ�� 
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		//a.add("aa"); ����ͨ����
		int i2 = a.get(0);//��������ת����
	}
}
