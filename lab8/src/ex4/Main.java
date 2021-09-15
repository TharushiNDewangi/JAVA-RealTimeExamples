package ex4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Student>studentlist=new HashMap<String,Student>();
		
		Student s1=new Student("It19123196","DEW",4.0);
		Student s2=new Student("123","navn",4.0);
		Student s3=new Student("It19123195","nava",4.0);
		
		studentlist.put(s1.getStudentID(),s1);
		studentlist.put(s2.getStudentID(),s2);
		studentlist.put(s3.getStudentID(),s3);
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter student id ");
		String id=input.next();
		
		Student std=studentlist.get(id);
		if(std!=null)
		{
			std.display();
		}
		else
		{
			System.out.println("check!!!!!");
		}
		
	}
	
}
