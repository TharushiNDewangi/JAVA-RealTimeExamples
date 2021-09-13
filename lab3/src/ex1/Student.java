package ex1;

public class Student {
	protected String name;
	protected String ditno;
	protected String address;
	
	public Student(String name, String ditno, String address)
	{
		//super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetails()
	{
	  String s = " I am a Student.\n My name is "+name+".\n I am from "+address+".\n My dit no is "+ditno;
	  return s;
	
	}
	
	

}
