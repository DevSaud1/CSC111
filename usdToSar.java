package ussToSda;
import java.util.Scanner;

public class usdToSar {
	public static void main (String[] args ) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value in USD: ");
		
		double usd = input.nextDouble();
		double sar = usd * 3.75;
		
		System.out.print("The amount is "+sar+" SAR");
		
	}

}
