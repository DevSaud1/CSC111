package Building;

import java.util.Scanner;

public class testBuilding {

	public static void main(String[] args) {
		
		Building b = new Building();
		Scanner scanner = new Scanner(System.in);
		
		int apts = 0;
		double rent = 0;
		int n;
		
		System.out.print("Please enter the number of appartments and rent amount : ");
		apts = scanner.nextInt();
		b.setApts(apts);
		b.rent = scanner.nextDouble();
		
		System.out.print("How many delux appartments would you like to rent? ");
		n = scanner.nextInt();
		if (b.rentApt(n , "delux")) {
			System.out.println(n + " delux appartments have been rented");
		}else
			System.out.println("Requsted number of appartments exceeds availability");
		
		
		System.out.print("How many normal appartments would you like to rent? ");
		n = scanner.nextInt();
		if (b.rentApt(n , "normal")) {
			System.out.println(n + " normal appartments have been rented");
		}else
			System.out.println("Requsted number of appartments exceeds availability");	
		
		b.printInfo();
	}
	
}
