package lab05;
import java.util.Scanner;
public class Game {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String guess, secretWord;
		int count = 0;
		
		System.out.println("Player One:");
		System.out.println("Enter Secret Word: ");
		secretWord = scanner.next();
		
		System.out.println("Player Two:");
		System.out.println("Enter guess: ");
		guess = scanner.next();
		
		while(!guess.equalsIgnoreCase(secretWord)) {
			System.out.println("Wrong!, Guess again: ");
			guess = scanner.next();
			count++;		
		}
		
		System.out.println("Your Correct it was " + guess + "\nIt took you " + count +" guesses.");
		
	}
}
