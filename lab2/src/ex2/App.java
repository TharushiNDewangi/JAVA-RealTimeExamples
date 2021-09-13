package ex2;

import java.util.Scanner;

public class App {
	/**

 Write an expression to calculate kilometers from miles and yards.
Save the result of the expression in the variable kilometers.
Note: One mile is 1.609 kilometers. There are 1760.0 yards in a mile
	 */
	 
    /**
     * Method to get distance in miles and yard convert into Kilometers
     * @param miles
     * @return 
     */
    static double mileconvertIntoKms(double miles){
        double km=1.609*miles;
        return km;
    }
    
    static double yardconvertIntoKms(double yard){
        double km=1760*yard;
        return km;
    }
    
    /**
     * Method to get distance into km and convert into miles
     * @param km
     * @return 
     */
    static double convertIntoMiles(double km){
        double miles=km/1.609;
        return miles;
    }
    
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.print("Enter Distance in Miles  : ");
            double miles   =   sc.nextDouble();
            System.out.println(miles+" Miles equal to : "+mileconvertIntoKms(miles)+" KMs");
            
            System.out.print("Enter Distance in Km  : ");
            double yard   =   sc.nextDouble();
            System.out.println(yard+" Yard equal to : "+yardconvertIntoKms(yard)+" KMs");
            
            System.out.print("Enter Distance in Km  : ");
            double kms   =   sc.nextDouble();
            System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
            
           
            
            
        }
        catch(Exception E){
            System.err.println("Exception : "+E.getMessage());
        }
    }
}