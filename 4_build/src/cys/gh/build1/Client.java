package cys.gh.build1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Director d=new Director();
		Car car=d.buildCar();
		System.out.println(car);

	}

}
