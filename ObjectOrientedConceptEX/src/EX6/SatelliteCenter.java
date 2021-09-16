package EX6;

public class SatelliteCenter {
	int option;
	ISatellite [] iSatellite;
	IGeoLocation [] iTracker;
	
	
	
	public SatelliteCenter(int option, ISatellite[] iSatellite, IGeoLocation[] iTracker) {
		super();
		this.option = option;
		this.iSatellite = iSatellite;
		this.iTracker = iTracker;
	}

	public void startService(){
		iSatellite[option].activate();
	}
	
	public void stopService(){
		iSatellite[option].deactivate();
	}
	
	public void locationService(){
		
		iTracker[option].displayLocation();
	}
	
}
