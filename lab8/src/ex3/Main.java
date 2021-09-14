package ex3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset gives uniqury values
				HashSet<Double>heights=new HashSet<Double>();
				Scanner input=new Scanner(System.in);
				
				System.out.println("enter the hights values!!!! ");
				for(int i=0;i<10;i++)
				{
					System.out.println("enter value "+(i+1));
					double value=input.nextDouble();
					
					heights.add(value);
				}
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
				System.out.println("the uniqury  hights values are : "+heights);
			}

		}
