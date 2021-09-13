package lab5.ex1;

public class Dog extends Animal {
	
	   public Dog(String name) {
	      super(name);
	      System.out.println("Dog constructor called"); 
	   }
	   public String speak() {
	       return "Bow Wow";
	   }
	   

}

