package cys.gh.lesson4_1;
/*
 * 内部类的用法
 * 
 * 这个例子是  直接利用一个内部类派生一个类的写法
 */
class Car{
	class Wheel{
		
	}
}

public class PlaneWheel extends Car.Wheel{
	//这个就是一个特殊的构造方法  必须这样写
	PlaneWheel(Car car){
		car.super();//这是个特殊的语法
	}
	
	public static void main(String[] args){
		Car car = new Car();
		PlaneWheel pw = new PlaneWheel(car);
	}
}
