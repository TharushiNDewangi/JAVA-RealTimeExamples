package ex8;

public class Dog extends Pet{
	public int noOfMasters;
	
	public Dog(String n, String o, int a, int m)
	{
		super(n,o,a);
		noOfMasters = m;
		
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println(" I am a dog.I have "+noOfMasters+" masters at home");
	
	}

}
