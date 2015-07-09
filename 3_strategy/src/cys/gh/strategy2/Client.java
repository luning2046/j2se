package cys.gh.strategy2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		
		Environment e = new Environment(add);
		System.out.println(e.calculate(2, 5));
		
		
		Minus m = new Minus();
		e.setmStrategy(m);
		System.err.println(e.calculate(8, 2));
	}

}
