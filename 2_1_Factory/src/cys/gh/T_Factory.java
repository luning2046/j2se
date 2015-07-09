package cys.gh;
/*
 * 本例是简单工厂模式
 */
public class T_Factory {

	public static void main(String[] args){
		Car c = CarFactory.getCarInstance("Benz");
		c.run();
		c.stop();
	}
}
//一个接口
interface Car{
	void run();
	void stop();
}
//接口的实现
class Benz implements Car{
	public void run(){
		System.out.println("Benz汽车开动了！！");
	}
	public void stop(){
		System.out.println("Benz汽车停止了！！");
	}
}
class Fort implements Car{
	public void run(){
		System.out.println("Fort汽车开动了！！");
	}
	public void stop(){
		System.out.println("Fort汽车停止了！！");
	}
}
//工厂
class CarFactory{
	
	public static Car getCarInstance(String carName){
		
		Car c = null;
		try {
			c = (Car)Class.forName("cys.gh."+carName).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
}

