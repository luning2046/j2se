package cys.gh.myselfdefine_2;

public class MyselfDefine {
	/*
	 * ��������p��p2��p3�����в�ͬ������ ����p=p2�����ܰ�p2����p��
	 */
	public static void main(String[] args){
		//1.T����ָ��ΪString����
		Person<String> p = new Person<String>(101);
		p.setSecrecy("skdfj");
		String s=p.getSecrecy();
		System.out.println(p.getSecrecy());
		
		//2.T����ָ��ΪInteger����
		Person<Integer> p2 = new Person<Integer>(101);
		p2.setSecrecy(234);
		Integer s2=p2.getSecrecy();
		System.out.println(p.getSecrecy());
		
		//3.ʵ��������ʱҲ���Բ�ָ��T�ľ�����������
		//  ��ʱT�ľ�����������ΪObject����
		Person p3 = new Person(101);
		p3.setSecrecy(true);
		Boolean b = (Boolean)p3.getSecrecy();
		System.out.println(p3.getSecrecy());
		/*
		 * ��������p��p2��p3�����ֲ�ͬ������ ����p=p2�����ܰ�p2����p��
		 * Ҫ��ʵ����������Ҫ�����·�ʽ
		 */
		Person<?> person = null;//person���ÿ���ָ��������ͬ������
		person = new Person<String>(111);
		person = new Person<Integer>(343);
	}
}
