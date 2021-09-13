package ex2;

public class Person {
	protected String name;
	protected String address;
	public Person(String name, String address) {
		//super();
		this.name = name;
		this.address = address;
	}
	public void showDetails() 
	{
		System.out.println("name :"+name);
		System.out.println("Address :"+address);
	}
	
	
	

}
