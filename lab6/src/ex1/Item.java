package ex1;

//i)  It should store the following properties itemNo, name, unitPrice, qty 
public abstract class Item implements IPrint  {
	private int itemNo, qty;
	private String name;
	private double unitPrice;
	
	//iv) Implement a constructor to get the four properties as parameters and initialize them
	public Item(int itemNo, int qty, String name, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.qty = qty;
		this.name = name;
		this.unitPrice = unitPrice;
	}
//ii) The printLine() method should display the properties in one line. 
	public void printLine() {
		// the println function is not used
		// the details need to be printed in a single line
		// the inherited classes will use the code and add their details to the same
		// line
		System.out.print("Item No: " + itemNo + " Name: " + name + " Unit Price: " + unitPrice + " Quantity: " + qty);
	}
//iii) The printDetails() method should display the properties in multiple lines (one line for each property)
	public void printDetails() {
		System.out.println("--------------------------------------");
		System.out.println("Item No: " + itemNo);
		System.out.println("Name: " + name);
		System.out.println("Unit Price: " + unitPrice);
		System.out.println("Quantity: " + qty);
	}

}

