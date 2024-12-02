package lab09;

public class Car {
	
	private String model;
	private int year;
	private int mileage;
	private double soom;
	private double hadd;
	
	public Car() {
		
	}
	
	public Car(String model, int year, int mileage, 
			double soom, double hadd) {
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.soom = soom;
		this.hadd = hadd;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setYear(int Year) {
		this.year = Year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public void setSoom(double soom) {
		this.soom = soom;
	}
	
	public double getSoom() {
		return this.soom;
	}
	
	public void setHadd(double hadd) {
		this.hadd = hadd;
	}
	
	public double getHadd() {
		return this.hadd;
	}
	
	public boolean similar(Car c) {
		
			return (c.model.equalsIgnoreCase(this.model) &&
					c.year == this.year && Math.abs(this.mileage - c.mileage) <= 10000);
	}
	
	public double difference() {
		return soom - hadd;
	}
	
	public void printInfo() {
		System.out.println("The Car Model is a " + this.model + " was made is " + this.year + ".");
		System.out.println("It has " + this.mileage + " KM and soom is " + this.soom + " Hadd is " + this.hadd);
		System.out.println();
	}

}
