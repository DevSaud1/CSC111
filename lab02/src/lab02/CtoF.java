package lab02;
import java.util.Scanner;
public class CtoF {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the celsius degree: ");
		
		double celsius = read.nextDouble();
		
		double fahrenheit = 9.0/5 * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
	}
	

}
