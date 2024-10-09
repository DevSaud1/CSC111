import java.util.Scanner;
public class PosNeg {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please Enter The Number: ");
		int num = read.nextInt();
		
		if (num > 0)
			System.out.println("The Number is Positive");
		else if (num == 0)
			System.out.println("The Number is Zero");
		else
			System.out.println("The Number is Negative");
	}
	

}
