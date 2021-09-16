package EX5;

public abstract class user {
	protected String name;
	protected String email;

	public user(String name, String email)
	{
		super();
		this.name = name;
		this.email = email;


	}
	abstract public void PrintDetails();
	//abstract public String getdetails();
	

}
