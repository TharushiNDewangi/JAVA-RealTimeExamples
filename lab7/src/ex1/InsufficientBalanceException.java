package ex1;

public class InsufficientBalanceException extends Exception {

	private double amount;
	

	public InsufficientBalanceException(double amount) {
		//super();
		this.amount = amount;
	}


	public double getamount() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	

}
