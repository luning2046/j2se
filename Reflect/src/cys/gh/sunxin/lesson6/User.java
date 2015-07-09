package cys.gh.sunxin.lesson6;

class User{
	int id;
	String name;
	private int age;
	
	public User(){}
	
	public User(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	static{
		System.out.println("=========User==========");
	}
	
	public void output(){
		System.out.println("========output=========");
	}
	
	String getName(){
		return this.name;
	}
}
