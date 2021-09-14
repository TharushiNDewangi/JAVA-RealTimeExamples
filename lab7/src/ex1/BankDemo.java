package ex1;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		double withamount;
		String reason;
		boolean cont=true;
		boolean exe=false;
		Account account=new Account(123);
		System.out.println("Depositing rs 10,000");
		account.deposit(10000.00);
		while(cont){
		try{
			
				System.out.println("please enter amount to be withdrow:");
				withamount=input.nextDouble();
				System.out.println("withdrowrs "+withamount);
				account.withdrow(withamount);
				System.out.println("existing amount: "+account. getBalance());
				
			
			
			//System.out.println("withdrowrs 8000");
			//account.withdrow(8000.00);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("sry"+e.getamount());
			e.printStackTrace();
			exe=true;
			
	     }
		 finally 
		 {
			 if(exe)
			 {
				 System.out.println("“Do you wish to continue ? ");
				 reason=input.next();
				 if(reason.equalsIgnoreCase("no"))
				 {
					 cont=false;
				 }
				 else if(reason.equalsIgnoreCase("yes"))
				 {
						System.out.println("Depositing rs 10,000");
						account.deposit(10000.00);
				 }
				 else
				 {
					 cont=false;
					 System.out.println("you entered a wrong input!");
				 }
                  exe=false;
				}
				 
			 }
			
		}

	}
}
