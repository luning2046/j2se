package cys.gh.lesson4_1;
/*
 * �ڲ�����÷�
 * 
 * ���������  ֱ������һ���ڲ�������һ�����д��
 */
class Car{
	class Wheel{
		
	}
}

public class PlaneWheel extends Car.Wheel{
	//�������һ������Ĺ��췽��  ��������д
	PlaneWheel(Car car){
		car.super();//���Ǹ�������﷨
	}
	
	public static void main(String[] args){
		Car car = new Car();
		PlaneWheel pw = new PlaneWheel(car);
	}
}
