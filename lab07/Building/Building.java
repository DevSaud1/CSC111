package Building;

public class Building {
	
	private int apts;
	private int normal;
	private int delux;
	public double rent;
	
	public void setApts(int apts) {
		this.apts = apts;
	}
	
	public int howManyRented() {
		return (delux + normal);
	}
	
	public boolean rentApt(int n , String type) {
	
		if (n+delux+normal <= apts) {
			if (type == "delux")
				this.delux = delux + n;
			if (type == "normal")
				this.normal = normal + n;
			return true;
		}else 
			return false;	
	}
		
	public void printInfo() {
		double deluxRent = rent + (rent*0.2);
		System.out.println("========================= Building Info =========================");
		System.out.println("The building has " + apts + " appartment.");
		System.out.println("Only " + howManyRented() + " have been rented.");
		System.out.println(normal +" normal appartments with rent = " + rent + " SR per month");
		System.out.println(delux +"and delux appartments with rent = " + deluxRent + " SR per month.");
		System.out.println("=================================================================");
	}
	
}

