package lab09;
import java.util.Scanner;
public class testCar {

	public static void main(String[] args) {
		
		String model;
		int year, mileage;
		double soom, hadd;
		
		Scanner scanner = new Scanner(System.in);
		Car car1 = new Car();
		
		System.out.println("Please enter car model, year, mileage, hadd and soom");
		car1.setModel(scanner.next());
		car1.setYear(scanner.nextInt());
		car1.setMileage(scanner.nextInt());
		car1.setHadd(scanner.nextDouble());
		car1.setSoom(scanner.nextDouble());
		
		System.out.println("Please enter car model, year, mileage, hadd and soom");
		model = scanner.next();
		year = scanner.nextInt();
		mileage = scanner.nextInt();
		hadd = scanner.nextDouble();
		soom = scanner.nextDouble();
		Car car2 = new Car(model, year, mileage, hadd, soom);
		
		car1.printInfo();
		car2.printInfo();
		
		if (car1.similar(car2)) System.out.println("Both cars are similar and mileage with in 10000KM");
		else System.out.println("Cars are not similar");

	}

}
