package ex1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i) Create two Tablet type objects. 
		Tablet t1 = new Tablet(1, 37900, "MEDIAPAD T5", 10, "Huawei", "T5", "5MP");
		Tablet t2 = new Tablet(2, 37900, "GALAXY TAB 5SE", 10, "Samsung", "5SE", "13MP");

		//ii) Create two Vegetables type objects.
		Vegetable v1 = new Vegetable(3, 240, "Carrot", 45, false, 41);
		Vegetable v2 = new Vegetable(4, 150, "Cabbage", 45, true, 25);
		//iii) Create IPrint type of array of four elements and store these four objects in it and using a for loop display all items using the printLine() method
		
		// Creating IPrint type of array of four elements
				IPrint[] printableItems = new IPrint[4];
				
				// store the four objects
				printableItems[0] = t1;
				printableItems[1] = t2;
				printableItems[2] = v1;
				printableItems[3] = v2;

				for (int i = 0; i < 4; i++)
				{
					printableItems[i].printLine();
	            }
	}
}
