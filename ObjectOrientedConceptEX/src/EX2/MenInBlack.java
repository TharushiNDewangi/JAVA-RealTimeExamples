package EX2;

public class MenInBlack {
	public int score=0;
	public AlienPack alienpack;
	public MenInBlack(AlienPack alienpack) {
		super();
		//this.score = score;
		this.alienpack = alienpack;
	}
	
	
	public void kill() 
	{
		
		Alien[] alien=alienpack.getAlien();
		
	   for(Alien pack:alien)
		{
		   score++;
	    }
	   System.out.println("your Score is "+score);
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public AlienPack getAlienpack() {
		return alienpack;
	}


	public void setAlienpack(AlienPack alienpack) {
		this.alienpack = alienpack;
	}

}
