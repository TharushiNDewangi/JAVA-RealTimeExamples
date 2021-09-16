package EX2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlienPack pack1=new AlienPack(5);
		pack1.addAlien(new MarshmalloAlien(),0);
		pack1.addAlien(new OgreAlien(),1);
		pack1.addAlien(new OgreAlien(),2);
		pack1.addAlien(new SnakeAlien(),3);
		pack1.addAlien(new MarshmalloAlien(),4);
		
		MenInBlack agentK=new MenInBlack(pack1);
		agentK.kill();
		System.out.println("your Score is "+agentK.getScore());

	}

}
