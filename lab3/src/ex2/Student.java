package ex2;

public class Student extends Person{
	protected String studentid;

	public Student(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("id :"+studentid);
	}
	
	
}
