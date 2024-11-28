package lab02;
import java.util.Scanner;

public class Tips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gartuity rate: ");
		
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double gartuity = subtotal * rate / 100;
		double total = subtotal + gartuity;
		
		System.out.println("The gartuity is: " + gartuity +"\n"+
							"Total is: " + total +"$");
		
	}

}
