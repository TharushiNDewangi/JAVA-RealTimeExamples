package ex8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet("Lissie","Smith",3);
		p.showDetails();
		System.out.println();
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails();
		System.out.println();
		
		Dog d = new Dog("max","dew",0,1);
		d.showDetails();
		System.out.println();
		Pet p3 = c;  
		p3.showDetails(); 
	}

}
