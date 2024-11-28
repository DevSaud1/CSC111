package lab08;
import java.util.Scanner;

public class testStock {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stock stock1 = new Stock();
		
		System.out.print("Enter symbol of stock: ");
		stock1.setSymbol(scanner.next());
		System.out.print("Enter name of stock: ");
		stock1.setName(scanner.next());
		System.out.print("Enter price of stock: ");
		stock1.setCurrentPrice(scanner.nextDouble());
		System.out.print("Enter previos price of stock: ");
		stock1.setPreviosClosingPrice(scanner.nextDouble());
		
		System.out.println("For the stock " +stock1.getSymbol()+ " of the company " +stock1.getName());
		System.out.println("# Previos closing Price: " + stock1.getPreviosClosingPrice());
		System.out.println("# Current Price: " +stock1.getCurrentPrice());
		System.out.println("# Price change: " +stock1.getChange() +"%");
		
	}

}
