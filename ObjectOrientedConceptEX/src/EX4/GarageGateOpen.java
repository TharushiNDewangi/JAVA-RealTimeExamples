package EX4;

public class GarageGateOpen implements Command {
	GarageGate garageGate;
	
	public GarageGateOpen(GarageGate garageGate) {
		this.garageGate = garageGate;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageGate.Open();
		
	}

}
