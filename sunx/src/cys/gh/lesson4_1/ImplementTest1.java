package cys.gh.lesson4_1;

/*
 * �������ڲ����һ��ʹ�ó�����
 * 	   ���ڲ���ʵ��һ���ӿڣ��ҽ����ڲ��ඨ���private�ģ�������������ʵ��ϸ��
 *	   ��Ϊ  һ���ʵ�ֽӿڵ��ֻ࣬�ܽ�������  public��Ĭ�����η�  ���Σ���ô��������
 *     ����ֱ����������࣬Ҳ��֪������ʵ��ϸ����
 *     
 */
interface Animal{
	void eat();
	void sleep();
}

class Zoo{
	//�������Zoo��֮�� ���ܱ�ʵ�����ˣ�������Ͳ���ֱ��new���Tiger�࣬Ҳ��������������ʵ��ϸ��
	private class Tiger implements Animal{
		
		public void eat() {
			System.out.println("tiger eat!");
		}
		public void sleep() {
			System.out.println("tiger sleep!");	
		}
	}
	
	public Animal getAnimal(){
		return new Tiger();
	}
}

public class ImplementTest1 {
	public static void main(String[] args){
		Zoo z = new Zoo();
		Animal animal = z.getAnimal();
		animal.eat();
		animal.sleep();
	}
}
