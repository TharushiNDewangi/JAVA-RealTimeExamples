package ex1;
///f
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//g
		Student std[] = new Student[5];
		std[0]=new Student("dew","IT","07123456");
		std[1]=new Student("dew1","IT","07123456");
		std[2]=new Student("dew2","IT","07123456");
		std[3]=new Student("dew3","IT","07123456");
		std[4]=new Student("dew4","IT","07123456");
		//h
		for(int i =0;i<5;i++)
		{
			
			std[i].print();
			System.out.println();
		}
		
	}

}
