package lab08;

public class Student {
	
	private String name;
	private int age;
	private double GPA;
	
	public Student() {
		this.name = "";
		this.age = 0;
		this.GPA = 0.0;
	}
	
	public Student(String name, int age, double GPA) {
		this.name = name;
		this.age = age;
		this.GPA = GPA;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setGPA(double gpa) {
		this.GPA = gpa;
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	public void printInfo() {
		System.out.println("Your name is " + name + "\nand your GPA is " + GPA + "\nand your age is " +age);
	}
}
