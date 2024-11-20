package car_rental;
import java.util.Scanner;

public class CarRentalDemo {
	
	public static boolean isValidCarType(char type) {
	    type = Character.toUpperCase(type);
	    if (type == 'E' || type == 'S' || type == 'L')
	        return true;
	    else
	        return false;
	}

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     
	     while (true) {
	    	 
	         System.out.print("Enter a rental car model (or 'exit' to stop): ");
	         String model = scanner.next();
	         if (model.equalsIgnoreCase("exit")) { 
	             System.exit(0);
	         }
	         
	         System.out.print("Enter a rental car type ('E', 'S', or 'L'): ");
	         char type = scanner.next().charAt(0);
	         while (!isValidCarType(type)) { // while type is not valid will continue true
	             System.out.println("ERROR: Incorrect rental car type. Type can be 'E', 'S', or 'L' only.");
	             System.out.print("Enter a rental car type ('E', 'S', or 'L'): ");
	             type = scanner.next().charAt(0);
	         }

	         System.out.print("Enter the number of rental days: ");
	         int days = scanner.nextInt();
	         
	         CarRental rental = new CarRental(model, type, days);
	         rental.displayInfo();

	         System.out.println("====================================================");
	     }
	   
	 }
	 
}
