package cys.gh.zxx;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 没有使用泛型情况
		 *  1 当执行到第18条语句时，编译不会出错，执行时会抛classCastException异常
		 *   造成这个错误的原因，就是在向集合中添加元素时，没有指定元素类型，都按Object类型
		 *   因此在从集合中去数据时就需要进行类型转换。编译时能通过，执行时就可能抛异常
		 */
		ArrayList al = new ArrayList();
		al.add(1);//第0个元素
		al.add(1L);//第1个元素
		al.add("aa");//第2个元素
		int i = (Integer)al.get(2);//取第2个元素，运行期执行到此语句时要抛异常，因为String类型不能转为int类型
		
		/*
		 *使用泛型就可解决上面的问题
		 *	这样就明确了集合中只能存放Integer类型的数据，要是存放其他类型的数据
		 *	就会在编译期 都不能通过 
		 */
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		//a.add("aa"); 编译通不过
		int i2 = a.get(0);//不用类型转换了
	}
}
