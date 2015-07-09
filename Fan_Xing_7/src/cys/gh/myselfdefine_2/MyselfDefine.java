package cys.gh.myselfdefine_2;

public class MyselfDefine {
	/*
	 * 此例子中p，p2，p3是三中不同的引用 不能p=p2（不能把p2付给p）
	 */
	public static void main(String[] args){
		//1.T具体指定为String类型
		Person<String> p = new Person<String>(101);
		p.setSecrecy("skdfj");
		String s=p.getSecrecy();
		System.out.println(p.getSecrecy());
		
		//2.T具体指定为Integer类型
		Person<Integer> p2 = new Person<Integer>(101);
		p2.setSecrecy(234);
		Integer s2=p2.getSecrecy();
		System.out.println(p.getSecrecy());
		
		//3.实例化对象时也可以不指定T的具体数据类型
		//  此时T的具体数据类型为Object类型
		Person p3 = new Person(101);
		p3.setSecrecy(true);
		Boolean b = (Boolean)p3.getSecrecy();
		System.out.println(p3.getSecrecy());
		/*
		 * 此例子中p，p2，p3是三种不同的引用 不能p=p2（不能把p2付给p）
		 * 要想实现这种需求要用如下方式
		 */
		Person<?> person = null;//person引用可以指向其他不同类型了
		person = new Person<String>(111);
		person = new Person<Integer>(343);
	}
}
