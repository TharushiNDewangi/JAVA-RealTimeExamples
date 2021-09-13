package ex2;

public class InheritanceDemo {
	public static void main(String args[])
	{
		Person p = new Person("deww1","sliit");
		p.showDetails();
		System.out.println();
		Student s1 = new Student("dew","SLIIT","IT19123196");
		s1.showDetails();
		System.out.println();
		PartTimeStudent p1 = new PartTimeStudent("ssd","Malabe","BM192345",12);
		p1.showDetails();
	}
}