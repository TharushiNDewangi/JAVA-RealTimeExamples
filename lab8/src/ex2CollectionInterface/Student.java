package ex2CollectionInterface;

public class Student {
	public String studentID, Name ;
	public double GPA;
	public Student(String studentID, String name, double gPA) {
		super();
		this.studentID = studentID;
		Name = name;
		GPA = gPA;
	}
	public void display()
	{
		System.out.println("student id:"+studentID);
		System.out.println("student Name:"+Name);
		System.out.println("student GPA:"+GPA);
	}
	

}
