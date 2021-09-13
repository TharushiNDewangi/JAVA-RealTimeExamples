package ex1;

//d) Implement a sub class called Vegetables that extends the Item abstract class. 
public class Vegetable extends Item {
	//i) Add the following properties organic, calories (organic – true/false, calories – integer (per 100 grams)
	private boolean organic;
	int calories;
	//ii) Implement a constructor to get all the six properties of this class as parameters and initialize them.
	public Vegetable(int itemNo, int qty, String name, double unitPrice, boolean organic, int calories) {
		super(itemNo, qty, name, unitPrice);
		this.organic = organic;
		this.calories = calories;
	}
	
 //iii) Override the printLine() and printDetails() methods to display details of all the properties. 
	public void printLine() {
		super.printLine();
		System.out.print(" Organic: " + organic + " Calories: " + calories + "\n");
	}

	public void printDetails() {
		super.printDetails();
		System.out.println("--------------------------------------");
		System.out.println("Organic: " + organic);
		System.out.println("Calories: " + calories);
		System.out.println("--------------------------------------");
	}

}
