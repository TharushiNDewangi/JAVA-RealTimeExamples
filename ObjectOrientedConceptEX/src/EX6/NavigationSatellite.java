package EX6;

public class NavigationSatellite implements ISatellite{
	
	String name;
	
	public NavigationSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(this.name + " navigational satellite activate");		
	}

	@Override
	public void deactivate() {
		System.out.println(this.name + " navigational satellite deactivate");
	}
}
