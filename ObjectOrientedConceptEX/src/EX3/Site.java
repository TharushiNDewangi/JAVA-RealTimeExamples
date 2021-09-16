package EX3;

public class Site implements IConstruction{
	
	Item[] items;

	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Site(Item[] items) {
		super();
		this.items = items;
	}



	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		double cost;
		double totcost=0;
		for(int i=0;i<5;i++)
		{
			cost =items[i].getCost() * items[i].getQuantity();
			System.out.println(items[i].displayltem() +" => " + items[i].getCost() +" * "+items[i].getQuantity() + 
					" = "+cost);
			totcost=cost+totcost;
		}
		System.out.println("Total cost " + totcost);
		
	}

}
