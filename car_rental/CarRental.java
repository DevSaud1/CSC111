package car_rental;

public class CarRental {
	 private static int numOfRentals = 0;
	 private String carModel;
	 private String rentalID;
	 private char carType;
	 private int rentalDays;
	
	 public CarRental(String model, char type, int days) {
	     carModel = model;
	     carType = type;
	     rentalDays = days;
	     rentalID = generateRentalID();
	     numOfRentals++;
	 }
	
	 private String generateRentalID() {
	     String first3chars = carModel.substring(0, 3).toUpperCase();
	     return first3chars + "R" + numOfRentals;
	 }
	
	 // Calculates rental cost based on car type and rental duration
	 public double calculateRentalCost() {
	     double costPerDay;
	     switch (carType) {
	         case 'E': case 'e': // Economy
	             costPerDay = 75;
	             break;
	         case 'S': case 's': // Standard
	             costPerDay = 100;
	             break;
	         case 'L': case 'l': // Luxury
	             costPerDay = 175;
	             break;
	         default:
	             return 0; // Invalid
	     }
	     return costPerDay * rentalDays;
	 }
	
	 // Displays rental information
	 public void displayInfo() {
	     System.out.println("Model: " + carModel + ", ID: " + rentalID + ", Type: " + carType +
	             ", Rental days: " + rentalDays + ", Total cost: " + calculateRentalCost() + " SAR");
	 }
	
	 // Setters and Getters
	 public String getCarModel() {
	     return carModel;
	 }
	
	 public void setCarModel(String carModel) {
	     this.carModel = carModel;
	 }
	
	 public String getRentalID() {
	     return rentalID;
	 }
	
	 public char getCarType() {
	     return carType;
	 }
	
	 public void setCarType(char carType) {
	     this.carType = carType;
	 }
	
	 public int getRentalDays() {
	     return rentalDays;
	 }
	
	 public void setRentalDays(int rentalDays) {
	     this.rentalDays = rentalDays;
	 }
}
