package EX1;

public abstract class Vehicle {
	public double speed ; 
	public double regularPrice ;
	public String colour ;
	public Vehicle(double speed, double regularPrice, String colour) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}
	public Vehicle(double speed, String colour) {
		super();
		this.speed = speed;
		
		this.colour = colour;
	}
	abstract public double getSalePrice();

}
