package Triangle;

import java.util.Scanner;
public class testTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Triangle triangle = new Triangle();
		
		while (true) {

			System.out.print("Please Enter The Three Sides of The Triangle (or '0' to stop): ");
			triangle.side1 = scanner.nextDouble();
			triangle.side2 = scanner.nextDouble();
			triangle.side3 = scanner.nextDouble();
			
			if (triangle.side1 == 0) System.exit(0);
			
			if (triangle.isItTriangle()) {
				System.out.println("It is a triangle");
				
				if (triangle.isItRight())
					System.out.println("It is a right triangle");
	
				System.out.println("The longest side is: " + triangle.longest());
			
			}else 
				System.out.println("It is NOT a triangle");
			
			System.out.println("------------------------------------------");
		}
	}

}
