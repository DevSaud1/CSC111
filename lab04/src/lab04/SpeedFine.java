package lab04;

import java.util.Scanner;
public class SpeedFine {

	public static void main(String[] args) {
		// define scanner
		Scanner read = new Scanner(System.in);
		// read the speed from the user
		System.out.println("Pleas enter the speed:");
		int speed = read.nextInt();
		// to cheek if the value is correct
		if (speed > 0 && speed <=240) {
			// to output a fine based on the speed 
			if (speed <= 100)
				System.out.println("No Fine");
			else if ((speed > 100) && (speed<113))
				System.out.println("The fine is: 300 SAR");
			else if ((speed > 113) && (speed<140))
				System.out.println("The fine is: 500 SAR");
			else if (speed >140)
				System.out.println("The fine is: 1000 SAR");	
		}
		else
			System.out.println("Speed must be between 0 and 240 in km\\h");	
	}

}
