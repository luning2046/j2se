package cys.gh.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList_1 {

	public static void main(String[] args){
//		List l = new ArrayList();
//		l.add("cys");
//		l.add("gh");
//		l.add("cyy");
//		System.out.println(l.get(10));//默认调用每个元素的toString方法将元素打印输出
//		Object[] objs = l.toArray();//将List集合转换为一个数组
//		for(int i=0;i<objs.length;i++){
//			System.out.println(objs[i]);
//		}
//		
//		List l2 = Arrays.asList(objs);//将一个数组转换为集合
//		System.out.println(l2);//l2这个集合此时就是一个固定尺寸的集合  因此不能在往集合添加新的元素了
//		//l2.add("dfj"); 此句会产生运行期异常
		
		testArrayList2();
	}
	
	/**
	 * 这个方法执行会产生异常：
	 * 原因是：在迭代过程中，不要操作集合中的元素，容易产生异常。
	 * 可以使用Iterator接口的子接口ListIterator来完成在迭代中对元素进行更多的
	 * 操作  
	 * testArrayList2()中就是ListIterator的例子
	 */
	private static void testArrayList(){
		List l = new ArrayList();
		l.add("cys");
		l.add("gh");
		l.add("cyy");
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String ele = it.next();//在这行  抛出java.util.ConcurrentModificationException
			if(ele.equals("gh")){
				l.add("zyx");
			}else{
				System.out.println("next:"+ele);
			}
		}
		System.out.println(l);
	}
	/**
	 * ListIterator列表迭代器
	 * 它可以实现在迭代过程中完成对元素的增删改查。
	 * 注意：只有List集合才具备该迭代功能
	 */
	private static void testArrayList2(){
		List l = new ArrayList();
		l.add("cys");
		l.add("gh");
		l.add("cyy");
		ListIterator<String> it = l.listIterator();
		while(it.hasNext()){//it.hasPrevious()
			String ele = it.next();//在这行  抛出java.util.ConcurrentModificationException
			if(ele.equals("gh")){
				it.set("zyx");
			}else{
				System.out.println("next:"+ele);
			}
		}
		System.out.println(l);
	}
}
