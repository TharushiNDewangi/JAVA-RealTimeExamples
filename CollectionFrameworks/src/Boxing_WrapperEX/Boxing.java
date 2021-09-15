package Boxing_WrapperEX;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		oldWay();
		newWay();

	}
	/**
	 * Unboxing increment and boxing
	 */
	public static void oldWay(){
		
		@SuppressWarnings("removal")
		Integer wrapper = new Integer(10);
		System.out.println("Early = " + wrapper);
		//Unboxing
		int primitive = wrapper.intValue();
		//increment
		primitive++;
		//Boxing
		wrapper = Integer.valueOf(primitive);		
		System.out.println("After = " + wrapper);
	}
	
	/**
	 * Auto boxing
	 */
	public static void newWay(){
		
		Integer wrapper = new Integer(10);
		System.out.println("Early = " + wrapper);
		wrapper++;
		System.out.println("After = " + wrapper);
	}

}



