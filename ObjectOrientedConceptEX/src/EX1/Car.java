package EX1;

public class Car extends Vehicle{

	public Car(double speed, double regularPrice, String colour) {
		super(speed, regularPrice, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getRegularPrice()
	{
		return regularPrice;
	}

}
