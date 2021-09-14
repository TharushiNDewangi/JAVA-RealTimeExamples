package ex1Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create an integer ArrayList object. Check array list is empty or not. If ArrayList is empty, 
add 10 numbers. The numbers must be taken as keyboard inputs. Access each element of 
ArrayList and calculate the total print the 10 numbers.

 * @author DELL
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int tot=0;
		//create arry list object
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(5);
		// Check array list is empty or not
		//if empty
		if(array.size()==0)
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("enter value"+(i+1));
				int value=input.nextInt();
				array.add(value);
			}
			for(int item:array)
			{
				System.out.println(item);
				tot=tot+item;
			}
			System.out.println(tot);
		}
		//if not empty
		else
		{
			int size = array.size();
			for(int i=0;i<size;i++)
			{
				System.out.println("ar value"+(i));
				System.out.println(" value"+array.get(i));
				
			}
			for(int i=0;i<10;i++)
			{
				System.out.println("enter value"+(i+1));
				int value=input.nextInt();
				array.add(value);
			}
			for(int item:array)
			{
				System.out.println(item);
				tot=tot+item;
			}
			System.out.println(tot);
			
		}
		
	}

}

