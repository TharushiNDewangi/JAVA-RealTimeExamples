package EX1;

public class Bus extends Vehicle{
	public int Year ;
	public double  manufacturerDiscount;
	public Bus(double speed, double regularPrice, String colour, int year, double manufacturerDiscount) {
		super(speed, regularPrice, colour);
		Year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	 public double getSalePrice()
	 {
		 regularPrice=regularPrice-manufacturerDiscount;
		 return regularPrice;
	 }

}
