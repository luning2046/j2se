package cys.gh.parentFX_4;

public class Person<T>{
	private final int id;
	private T secrecy;
	
	public Person(int id){
		this.id=id;
	}
	public void setSecrecy(T t){
		secrecy=t;
	}
	public T getSecrecy(){
		return secrecy;
	}
	
}
