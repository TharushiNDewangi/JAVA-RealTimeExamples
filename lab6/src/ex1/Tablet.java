package ex1;

//c. Implement a sub class called Tablet that extends the Item abstract class
public class Tablet extends Item {
	//i) Add the following properties brand, model, camera 
	private String brand, model, camera;

	//ii) Implement a constructor to get all the seven properties of this class as parameters and initialize them.
	public Tablet(int itemNo, int qty,String name, double unitPrice, String brand,String model, String camera) 
	{
		super(itemNo, qty, name, unitPrice);
		this.brand = brand;
		this.model = model;
		this.camera = camera;
	}
	//iii) Override the printLine() and printDetails() methods to display details of all the properties

	public void printLine() {
		super.printLine();
		System.out.print(" Brand: " + brand + " Model: " + model + " Camera: " + camera + "\n");
	}

	public void printDetails() {
		super.printDetails();
		System.out.println("--------------------------------------");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Camera: " + camera);
		System.out.println("--------------------------------------");
	}
}
