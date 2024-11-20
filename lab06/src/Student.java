public class Student {

	public String name;
	public int age;
	public double GPA;
	public static String course;
	
	// methods
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student GPA: " + GPA);
		System.out.println("Student Cource: " + course);
		System.out.println("-----------------------------");
	}
	
	public void GPAToPersantage() {
		System.out.println(name +" GPA: " + GPA);
		System.out.printf(name +" GPA as persantage: %.1f \n",(GPA/5.0)*100);
		
	}
	
}