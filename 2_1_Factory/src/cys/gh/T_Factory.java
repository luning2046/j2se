package cys.gh;
/*
 * �����Ǽ򵥹���ģʽ
 */
public class T_Factory {

	public static void main(String[] args){
		Car c = CarFactory.getCarInstance("Benz");
		c.run();
		c.stop();
	}
}
//һ���ӿ�
interface Car{
	void run();
	void stop();
}
//�ӿڵ�ʵ��
class Benz implements Car{
	public void run(){
		System.out.println("Benz���������ˣ���");
	}
	public void stop(){
		System.out.println("Benz����ֹͣ�ˣ���");
	}
}
class Fort implements Car{
	public void run(){
		System.out.println("Fort���������ˣ���");
	}
	public void stop(){
		System.out.println("Fort����ֹͣ�ˣ���");
	}
}
//����
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

