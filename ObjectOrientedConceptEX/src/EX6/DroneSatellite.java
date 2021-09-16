package EX6;

public class DroneSatellite implements ISatellite{
	
	String name;
	
	public DroneSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(this.name + " drone satellite activate");		
	}

	@Override
	public void deactivate() {
		System.out.println(this.name + " drone satellite deactivate");
	}
}