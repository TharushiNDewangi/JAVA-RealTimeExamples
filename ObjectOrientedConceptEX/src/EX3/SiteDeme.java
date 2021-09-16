package EX3;

public class SiteDeme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item [] items = new Item[5];
		items[0] =new Cement(5);
		items[1] =new Stones(3);
		items[2] =new Sand(5);
		items[3] =new Cement(4);
		items[4] =new Sand(4);
		
		Site site = new Site(items);
		site.calculateCost();

	}

}
