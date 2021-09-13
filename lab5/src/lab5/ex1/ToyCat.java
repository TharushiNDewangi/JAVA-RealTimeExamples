package lab5.ex1;

public class ToyCat extends Cat {
	  String manufacturer;
	  public ToyCat(String name, String manufacturer) {
	     super(name);
	     this.manufacturer = manufacturer;
	     System.out.println("ToyCat constructor called"); 
	  }
	  public void display() {
	     super.display();
	     System.out.println("I am from " + manufacturer + ".");
	  }
	}

