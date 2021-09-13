package ex1;

public class Student {

		//public static int studentid ;
		public String name;
		public String degree;
		public String mobile;
	//b
		public static int max = 100;
		public Student(String name, String degree, String mobile) {
			//super();
			this.name = name;
			this.degree = degree;
			this.mobile = mobile;
		}

	//c
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	//d
		public void print()
		{
		 System.out.println("student id:"+getNextStudentID());
		 System.out.println("name:"+name);
		 System.out.println("degree:"+degree);
		 System.out.println("mobile:"+mobile);
		
		}
		
		public static int getNextStudentID() 
		{
			
			return max++;
		
		}

	}
