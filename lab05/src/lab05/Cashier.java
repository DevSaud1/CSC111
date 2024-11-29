package lab05;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		double price, subtotal, total = 0;
		int quan; // quantity
		
		System.out.println("******** Welcome To Cashier System ********");
		
		do {
			System.out.print("Enter name: ");
			name = scanner.next();
			if (name.equalsIgnoreCase("stop"))
				break;
			System.out.print("Enter price: ");
			price = scanner.nextDouble();
			System.out.print("Enter quantity: ");
			quan = scanner.nextInt();
			subtotal = quan * price;
			System.out.print("The Subtotal is : " + subtotal+ " SR \n");
			
			total = total + subtotal;
			
		}while (!name.equalsIgnoreCase("stop"));
		
		System.out.println("***********************************");
		System.out.println("Your total is : " + total);
		System.out.println("***********************************");
		
	}

}
