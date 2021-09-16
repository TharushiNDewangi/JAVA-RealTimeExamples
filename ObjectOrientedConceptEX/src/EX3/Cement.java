package EX3;

public class Cement extends Item {
	double qtylnCubes;
	
	

	public Cement(double qtylnCubes) {
		super();
		this.qtylnCubes = qtylnCubes;
	}

	@Override
	public String displayltem() {
		// TODO Auto-generated method stub
		return "Cement";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1000.0;
	}

	@Override
	public double getQuantity() {
		// TODO Auto-generated method stub
		return qtylnCubes;
	}

}
