package ex1;

public class Test {
	/**
	 * a) Create a class called Student. Student has a name, ditno and an address. Use 
appropriate data types also.
b) Create another class called Test, create two students objects from students class, and 
assign different values to the attributes.
c) Display the values.
d) Modify the previously written Student class as follows:
a) Add a constructor to initialize all three variables.
b) Then create objects using the above constructor
a) Modify the Student class and add 3 Mutator methods and 3 Accessor methods as given 
below to implement data hiding.
b) For proper data hiding make attributes private.
Modify the Student class and add a method called getDetails() which returns a String.
b) This method will return the details of the student as below:
I am a Student.
My name is Udaya.
I am from Malabe.
My dit no is DIT/11/C1/0010
c) Call getDetails() method in the Test class
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Dew","IT19123196","SLIIT");
		System.out.println(s1.getDetails());

	}

}
