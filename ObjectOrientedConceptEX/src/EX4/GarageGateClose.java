package EX4;

public class GarageGateClose implements Command{
	GarageGate garageGate;
	

	public GarageGateClose(GarageGate garageGate) {
		super();
		this.garageGate = garageGate;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageGate.Close();
		
	}

}
