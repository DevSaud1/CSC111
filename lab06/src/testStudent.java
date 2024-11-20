import java.util.Scanner;

public class testStudent {
	
	public static void main (String[] args) {
		
		Student s1 = new Student(); // objects
		Student s2 = new Student();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter couse name: "); 
		Student.course = input.next(); // course is Shared for all objects
		
		// first object s1
		System.out.print("Please enter first student Name, Age and GPA: ");
		s1.name = input.next();
		s1.age = input.nextInt();
		s1.GPA = input.nextDouble();
		
		// second object s2
		System.out.print("Please enter second student Name, Age and GPA: ");
		s2.name = input.next();
		s2.age = input.nextInt();
		s2.GPA = input.nextDouble();
		
		// calling methods
		s1.printInfo();
		s2.printInfo();
		s1.GPAToPersantage();
		s2.GPAToPersantage();
		
	}
	
}
