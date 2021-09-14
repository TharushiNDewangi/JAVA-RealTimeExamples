package ex1;

public class Account {
	int accnum;
	double balance;
	

	public Account(int accnum) {
		super();
		this.accnum = accnum;
	}
	

	public void display()
	{
		System.out.println("Account number:"+ accnum);
		System.out.println("Balance:"+ balance);
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdrow(double amount) throws InsufficientBalanceException
	{
		if((balance-amount)>=0)
		{
			balance=balance-amount;
		}
		else
		{
			throw new InsufficientBalanceException(balance); 
		}
		
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
