import java.util.Scanner;
public class ComperText {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Welcom To The String Compare Program");
		
		System.out.println("Pleas Enter The first Text: ");
		String firstText = read.next();
		
		System.out.println("Pleas Enter The Second Text: ");
		String secondText = read.next();
		
		System.out.println("Please Chose Your Type Of Comparision");
		System.out.println("(1) Case Sensitive \t (2) Case Insensitive");
		int option = read.nextInt();
		
		if (option == 1) {
			
			if (firstText.equals(secondText) )
				System.out.println("The Two Strings Are Equal");
			else
				System.out.println("The Two Strings Are NOT Equal");
			
		} else if (option == 2) {
			
			if (firstText.equalsIgnoreCase(secondText) )
				System.out.println("The Two Strings Are Equal");
			else
				System.out.println("The Two Strings Are NOT Equal");
		} else 
			System.out.println("Wrong Option!");
		
	}

}
