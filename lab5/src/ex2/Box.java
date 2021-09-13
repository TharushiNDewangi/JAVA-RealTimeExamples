package ex2;

public class Box implements ICompute{
	   private int length, width, height;
	   private int volume;
	Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		volume=length*width*width;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("volume is " + volume);
		
	}
	   
	   

}
