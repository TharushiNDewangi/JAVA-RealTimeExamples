package EX5;
import java.util.Scanner;
import java.util.InputMismatchException;
public class PlayASong {

	public static void main(String[] args) 
	{
		 Scanner myScanner = new Scanner(System.in);
		 String name,email,jobtit,music,nameoper,emailoper;
		 int empnum,numofdwnlod,numofsong;
		String[][] sngList=new String[5][2];
		Scanner array = new Scanner(System.in);
		
		//get user input for Artist in key board
		System.out.print("Enter Artist name:");
		name=myScanner.nextLine();
		System.out.print("Enter email:");
		email=myScanner.nextLine();
		System.out.print("Enter music genre:");
		music=myScanner.nextLine();
		System.out.print("Enter number of songs:");
		numofsong=myScanner.nextInt();
		//exception
		try
		{
			//get input for array
			for(int i=0;i<5;i++)
			{
				
				for( int j=0;j<1;j++)
				{
					System.out.println("Enter song:");
				    sngList[i][j]=array.nextLine();
				    j++;
					System.out.println("Enter Rate:");
					sngList[i][j]=array.nextLine();
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter value less than array limitation");
		}
		catch(Exception e)
		{
			System.out.println("exception is"+e);
		}
		finally
		{
			System.out.println("finishing up");
		}
		
		user u;
		//Artist a1 = new Artist("palblo Albo","palbo@Gmail.com","pop",5,sngList);
		//create object 
		Artist a1 = new Artist(name,email,music,numofsong,sngList);
		
		//get operator user input in keyboard
		String test=myScanner.nextLine();
		System.out.print("Enter Operater name:");
		nameoper=myScanner.nextLine();
		System.out.print("Enter email:");
		emailoper=myScanner.nextLine();
		System.out.print("Enter employee number:");
		empnum=myScanner.nextInt();
		String test1=myScanner.nextLine();
		System.out.print("Enter designation :");
		jobtit=myScanner.nextLine();
		
		//operater u1 = new operater("simon","simon@playsong.com",123,"accountant");
		//create object
		operater u1 = new operater(nameoper,emailoper,empnum,jobtit);
		
		//call print method
		a1.PrintDetails();
		System.out.println("");
		u1.PrintDetails();
		
		System.out.print("Enter Number of Downlods:");
		numofdwnlod=myScanner.nextInt();
		
		u1.setNumOfDownlod(numofdwnlod);
		u1.calcRevenus1(a1);
	}
	// TODO Auto-generated method stub

}
