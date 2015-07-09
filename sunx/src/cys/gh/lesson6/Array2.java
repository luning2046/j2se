package cys.gh.lesson6;

import java.util.Arrays;
/*数组元素是引用类型的排序 （必须实现了compareable接口）
 * System.arraycopy 方法 数组的拷贝
 * java.util.Arrays是操作数组的类
 */
public class Array2 {

	public static void main(String[] args){
		User1[] array1 = {new User1(1,"cys"),
						new User1(3,"cyy"),
						new User1(6,"gh"),};
		//排序
		Arrays.sort(array1);
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
	}
}

class User1 implements Comparable{
	int id;
	String name;

	User1(int id,String name){
		this.id=id;
		this.name=name;
	}
	//大于返回正数 小于返回负数 相等返回0
	public int compareTo(Object obj) {
		if(obj instanceof User){
			User user = (User)obj;
			return id>user.id ? 1 : (id == user.id ? 0 : -1);
		}
		return -1;
	}

	public String toString() {
		return id+":"+name;
	}

}
