package ex2;

public class PartTimeStudent extends Student{
	public int workinhours;

	public PartTimeStudent(String name, String address, String studentid, int workinhours) {
		super(name, address, studentid);
		this.workinhours = workinhours;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("working hours :"+workinhours);
	}
	
	

}
