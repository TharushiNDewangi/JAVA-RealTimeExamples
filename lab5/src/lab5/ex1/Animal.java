package lab5.ex1;

public abstract class Animal {
	private String name;
	   public Animal(String name) {
	       this.name = name;
	       System.out.println("Animal constructor called"); 
	   }
	  abstract public String speak() ;
	  public void display() {
	      System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
	  }
	}
