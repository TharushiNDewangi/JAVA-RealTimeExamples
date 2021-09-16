package EX3;

public class Stones extends Item{
	double qtylnCubes;
	

	public Stones(double qtylnCubes) {
		super();
		this.qtylnCubes = qtylnCubes;
	}

	@Override
	public String displayltem() {
		// TODO Auto-generated method stub
		return "Stone";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 750.0;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnCubes;
	}

}
