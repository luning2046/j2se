package cys.gh.lesson4_1;

/*
 * 本例是内部类的一个使用场景：
 * 	通过内部类  实现c++中多重继承
 */
interface Mechine{//机器
	void run();
}
class Person{//人
	void run(){
		System.out.println("run");
	}
}

class Robot extends Person{//机器人
	private class MechineHeart implements Mechine{//机器人心脏

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
