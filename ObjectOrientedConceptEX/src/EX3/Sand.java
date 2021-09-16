package EX3;

public class Sand extends Item{
	double qtylnCubes;
	
	

	
	public Sand(double qtylnCubes) {
		super();
		this.qtylnCubes = qtylnCubes;
	}

	@Override
	public String displayltem() {
		// TODO Auto-generated method stub
		return "Sand ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 850.0;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnCubes;
	}

}
