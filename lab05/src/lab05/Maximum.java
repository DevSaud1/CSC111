package lab05;
import java.util.Scanner;
public class Maximum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count, x, max = 0;
		
		System.out.print("Enter how many number you have? ");
		count = scanner.nextInt();
		
		System.out.print("Enter the numbers: ");
		
		for (int i=1; i<=count ; i++) {
			x = scanner.nextInt();
			if (x > max)
				max = x;	
		}
		System.out.print("The Maximum value is: "+ max);
	}

}
