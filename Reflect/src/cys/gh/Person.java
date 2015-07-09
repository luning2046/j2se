package cys.gh;

public class Person {

	private int id;
	private String name;
	private String address;
	private static Phone phone=new Phone();

	static {
		System.out.println("static block running....");
	}

	public Person() {
		System.out.println("person constructor running ....");
	}

	public void test(){
		System.out.println("method of test running..............");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
