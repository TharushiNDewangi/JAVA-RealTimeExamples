package ex2CollectionInterface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> StudentList=new ArrayList<Student>();
		Student s1=new Student("It19123196","DEW",4.0);
		Student s2=new Student("It19123197","nav",4.0);
		Student s3=new Student("It19123195","nava",4.0);
		
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		for(Student s:StudentList)
		{
			s.display();
			System.out.println("");
		}

	}

}
