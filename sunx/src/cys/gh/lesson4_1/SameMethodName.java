package cys.gh.lesson4_1;

/*
 * �������ڲ����һ��ʹ�ó�����
 * 	ͨ���ڲ���  ʵ��c++�ж��ؼ̳�
 */
interface Mechine{//����
	void run();
}
class Person{//��
	void run(){
		System.out.println("run");
	}
}

class Robot extends Person{//������
	private class MechineHeart implements Mechine{//����������

		public void run() {
			System.out.println("heart run");
		}		
	}
	Mechine getmechine(){
		return new MechineHeart();
	}
}
public class SameMethodName {

	public static void main(String[] args){
		Robot robot = new Robot();
		Mechine m = robot.getmechine();
		m.run();
		robot.run();
	}
}
