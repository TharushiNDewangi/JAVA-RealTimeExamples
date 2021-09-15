package studentex3;

public class Student {
	public String studentID, Name ;
	public double GPA, Height;
	
	
	
	public Student(String studentID, String name, double gPA, double height) {
		super();
		this.studentID = studentID;
		Name = name;
		GPA = gPA;
		Height = height;
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

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public void display()
	{
		System.out.println("student id:"+studentID);
		System.out.println("student Name:"+Name);
		System.out.println("student GPA:"+GPA);
		System.out.println("student GPA:"+Height);
	}
	

}