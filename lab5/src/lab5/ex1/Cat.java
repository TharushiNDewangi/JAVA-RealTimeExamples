package lab5.ex1;

public class Cat extends Animal {
	  public Cat(String name) {
	      super(name);
	      System.out.println("Cat constructor called"); 
	   }
	  public String speak() {
	      return "Meow Meow";
	  }
}
