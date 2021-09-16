package EX1;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v =new Truck(20.0,20000.00,"black",20.0);
		Vehicle v1 =new Bus(20.0,20000.00,"black",20,200.00);
		
		System.out.println("Truct price : "+v.getSalePrice());
		System.out.println("Bus price : "+v1.getSalePrice());

	}

}
