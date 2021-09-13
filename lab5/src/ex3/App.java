package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxSubjects;
	      int [] marks = new int[5];
	      int total = 0;
	      double avg;
	      
	      try {
	      // 1. Input a value for maxSubjects
	      //    from keyboard
	    	  System.out.println("enter maxSubjects ") ;
	  			Scanner input = new Scanner(System.in);
	  			maxSubjects=input.nextInt();
	      
	      // 2. Using a for loop 
	      //    input marks 
	  			for (int i = 0; i < maxSubjects; i++) {
					System.out.println("Please enter the marks for subject " + (i + 1));
					marks[i] = input.nextInt();
					// total need to be calculated in order to get the average
					total = total + marks[i];
				}
	      // 3. Calculate the avg marks
	    	  for( int i=0;i<5;i++)
		  		{
	    		  total=marks[i]+total;
		  			
		  		}
	    	  avg=total/5;
	    	  System.out.println("Avarage is"+avg);
	      
	      // 4. Use a try catch block to
	      //    prevent the following 
	      //    run time errors
	      
	      //   (a) Input valid integers to the 
	      //         inputs
	      //   (b) ArithmeticException division
	      //        by zero
	      //   (c) ArrayIndexOutOfBounds
	      //         Exception
	    	
	    		  
	    	  
	      
	      } 
	     
	      catch (ArithmeticException b) 
	      {
	            System.out.println("Divide by 0: " + b);
	        } 
	      catch (ArrayIndexOutOfBoundsException c) 
	      {
	            System.out.println("Array index oob: " + c);
	        }
	      catch (InputMismatchException e) 
	      {
	    	  System.out.println("Exception is"+e);
	      }
	      
	      finally {
	         System.out.println("This code will be gurrentied to run");
	      }
	    
	      System.out.println("The end");

	  }

}
