package cys.gh.lesson4_1;

/*
 * �����ڲ����ʹ��
 */
interface Animal1{
	void eat();
	void sleep();
}

class Zoo1{
	
	public Animal1 getAnimal(){
		
		
		/*
		 * ��ν���������ڲ��ࣺ����һ���ӿ�û����ʾ����implement�ؼ��ֱ�һ����ʵ��
		 * ����ֱ�� new �ӿ���(){
		 * 		����ֱ��ʵ�ֽӿڵĺ���
		 * }
		 */
		//������������ڲ���Ķ���
		return new Animal1(){
			
			public void eat() {
				System.out.println("tiger eat!");
			}
			public void sleep() {
				System.out.println("tiger sleep!");	
			}
		};
	}
}

public class ImplementTest2 {
	public static void main(String[] args){
		Zoo1 z = new Zoo1();
		Animal1 animal1 = z.getAnimal();
		animal1.eat();
		animal1.sleep();
	}
}
