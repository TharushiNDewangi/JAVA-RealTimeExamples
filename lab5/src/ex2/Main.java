package ex2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      ICompute ob1 = new Person("Danushka",40000, 1000, 5);
	      ob1.calculate();
	      ob1.display();
	      
	      ICompute ob2 = new Box(10, 20, 30);
	      ob2.calculate();
	      ob2.display();
	      
	      // 1. Implement the Person Class 
	      //    making use of the ICompute
	      //    interface
	      //    a) Write a constructor 
	      //    b) implements the methods
	      //       in ICompute
	      //       In compute() calculate 
	      //      netSal
	      
	      // 2. Implement the Box Class 
	      //    making use of the ICompute
	      //    interface
	      //    a) Write a constructor 
	      //    b) implements the methods
	      //       in ICompute
	      //        In compute() calculate
	      //       volume
	      
	      //  3. Create variables of Box
	      //     and Person Type and 
	      //     create objects
	      //     calculate and display
	      //     values
	      
	      //  4.Describe any advantage
	      //    you see in using interface
	      //    type variables seen in
	      //    the original main function code
	      //    variables obj1, obj2
	      //    as opposed to using object type
	      //    variables 


	}

}
