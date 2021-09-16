package EX2;

public class AlienPack {
	
	public Alien[] alien;
	int numofAlien;
	
	
	
	public AlienPack(Alien[] alien) {
		super();
		this.alien = alien;
	}
	public AlienPack(int numofAlien) {
		super();
		this.numofAlien = numofAlien;
	}
//	public AlienPack(Alien[] alien, int numofAlien) {
//		super();
//		this.alien = alien;
//		this.numofAlien = numofAlien;
//	}
	public void addAlien(Alien a, int index) throws NullPointerException {
		System.out.println("your Score is "+a);
		System.out.println("your Score is "+index);
		alien[index]=a;
//		for(int i=0;i<=index;i++)
//		{
//			alien[i]=a;
//			//tot=alienpack+tot;
//		}
		
	}

	public Alien[] getAlien() {
		return alien;
		
	}
	
	

}
