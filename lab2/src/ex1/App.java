package ex1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write and compile simple Java programs that uses calculations, input data from the keyboard.
		 int n,sum=0;
         
         Scanner sc=new Scanner(System.in);

          n=sc.nextInt();
          int a[]=new int[n]; 
          System.out.println("enter the "+n+" numbers ");
          for(int i=0;i<n;i++)
          {      
          System.out.println("enter  number  "+(i+1)+":");
                  a[i]=sc.nextInt();
          }
          for(int i=0;i<n;i++)
          {
                  sum+=a[i];
          }  	    
          System.out.println("sum of "+n+" numbers is ="+sum);                  
     	}

	

}
