package cys.gh.lesson6;

import java.util.Arrays;
/*����Ԫ�����������͵����� ������ʵ����compareable�ӿڣ�
 * System.arraycopy ���� ����Ŀ���
 * java.util.Arrays�ǲ����������
 */
public class Array2 {

	public static void main(String[] args){
		User1[] array1 = {new User1(1,"cys"),
						new User1(3,"cyy"),
						new User1(6,"gh"),};
		//����
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
	//���ڷ������� С�ڷ��ظ��� ��ȷ���0
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
