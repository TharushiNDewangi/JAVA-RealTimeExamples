package ex4;

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
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	

}
