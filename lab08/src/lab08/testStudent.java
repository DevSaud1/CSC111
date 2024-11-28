package lab08;

public class testStudent {
	
	public static void main (String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("saud",21,4.5);
		
		s1.setName("Ali");
		s1.setAge(20);
		s1.setGPA(4.7);
		s1.printInfo();
		System.out.println();
		
		s2.printInfo();
		
		System.out.println();
		if (s1.getGPA() > s2.getGPA())
			System.out.println(s1.getName()+ " GPA is higher");
		else
			System.out.println(s2.getName()+ " GPA is higher");
	}

}
