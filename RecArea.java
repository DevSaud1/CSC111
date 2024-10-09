import java.util.Scanner;

public class RecArea {
	
	public static void main (String[] args) {
		
		double length=0, width=0, area=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Please enter length of the rectangle: ");
		length = read.nextDouble();
		
		System.out.print("Please enter width of the rectangle: ");
		width = read.nextDouble();
		
		area = length * width;
		
		System.out.println("The area of the rectangle is: "+ area);
		
	}

}
