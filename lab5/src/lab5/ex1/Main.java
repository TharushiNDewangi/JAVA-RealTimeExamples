package lab5.ex1;

public class Main {
	public static void main(String[] args) {
	     Animal animal1 ;// this is OK, no object is created
	     
	     Cat mycat = new Cat("Micky");
	     mycat.display();
	     
	     Dog mydog = new Dog("Rover");
	     mydog.display();
	     
	     ToyCat mytoy = new ToyCat("kittie","Toysrus");
	     mytoy.display();
	     
	     animal1=mycat;
	     System.out.println("Cat speak  " + animal1.speak());
	     animal1=mydog;
	     System.out.println("Dog speak  " + animal1.speak());
	     

	     
	     // 1.  Make the Animal class an abstract class
	     //     Make the speak method an abstract method
	     //     Modifiy the main function.  
	     //     What needs to be removed and why?
	     //abstract class can"t create objects
	     //Animal animal1 = new Animal("test");
	     //animal1.display();
	     
	     // 2. Add default constructors to each of the
	     //    classes.  Display a message giving
	     //   details of the name of the constructor.
	     //   e.g. 
	     
	     //    public Animal() {
	     //         System.out.println
	     //             ("Animal constructor called");
	     //    }
	     //    Create an object of the ToyCat classes
	     //   call the default constructor
	     //   What will be the output?
	     //   Can you explain how why the output
	     //  appears as displayed?
	     
	  }
}
