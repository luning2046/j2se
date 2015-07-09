package cys.gh;

public class Test {

	public static void main(String[] args){
		System.out.println(add(2,3));
		System.out.println(add(1,2,4,5));
	}
	
	public static int add(int...args){
		int sum=0;
		for(int arg:args){
			sum+=arg;
		}
		return sum;
	}
}
