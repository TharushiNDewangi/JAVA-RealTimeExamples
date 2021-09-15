package studentex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>StudentList=new ArrayList<Student>();
		Student s1=new Student("It19123196","DEW",4.0,1.0);
		Student s2=new Student("It19123197","nav",4.0,2.9);
		Student s3=new Student("It19123195","nava",4.0,1.0);
		
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
//		StudentList.put(s1. getHeight(),s1);
//		StudentList.put(s2. getHeight(),s2);
//		StudentList.put(s3. getHeight(),s3);
		
		 HashSet<Double> hashSetNumbers
         = new HashSet<Double>();
		/*Converting List to HashSet using constructor.
        */
		for (int i = 0; i < StudentList.size(); ++i) {
			hashSetNumbers.add(StudentList.get(i).getHeight());
			//StudentList.get(i).display();
	        System.out.println(StudentList.get(i).getHeight());
	    }
		//Student std =std.getHeight()
      
 
       System.out.println("Unique Values of ArrayList");
 
       // iterate through HashSet
       
		for(Double s:hashSetNumbers)
		{
			//s.display();
			System.out.println("");
		}

	}

}

