package ex2;

public class Person implements ICompute {
	 private String name;
	   private double basicSal;
	   private double otRate;
	   private double otHrs;
	   private double netSal;
	   Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		
	}
	   
	   public void calculate()
	   {
		   netSal = basicSal+ (otRate *otHrs );
	   }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("person name is " + name);
		System.out.println("netSal is " + netSal);
		
	}

}
