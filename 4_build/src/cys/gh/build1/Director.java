package cys.gh.build1;

public class Director {
	
	private Builder b=new BuilderCar();
	
	//����������
	public Car buildCar(){
		b.carPart1();
		b.carPart2();
		b.carPart3();
		Car car=b.carOver();
		return car;
	}
}
