package EX1;

public class Truck extends Vehicle{
	public double  Weight;

	public Truck(double speed, double regularPrice, String colour, double weight) {
		super(speed, regularPrice, colour);
		Weight = weight;
	}
	 public double getSalePrice() 
	 {
		 if(Weight >2000)
		 {
			 regularPrice=regularPrice - (regularPrice*(100/10));
			 return regularPrice;
		 }
		 else
		 {
			 regularPrice=regularPrice - (regularPrice*(100/20));
			 return regularPrice;
		 }
	 }

}
