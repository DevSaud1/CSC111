package Triangle;

public class Triangle {
	
	public double side1=0;
	public double side2=0;
	public double side3=0;
	
	public boolean isItTriangle() {
		if (side1+side2 > side3 && side1+side3 > side2 && side2+side3 > side1)
			return true;
		else
			return false;
	}
	
	public boolean isItRight() {
		if (side1*side1 == side2*side2 + side3*side3 
				|| side2*side2 == side3*side3 + side1*side1 
				|| side3*side3 == side2*side2 + side1*side1) {
			return true;
		}else
			return false;	
	}
	
	public double longest() {
		double longest = 0;
		if (side1 > side2 && side1 > side3)
			longest = side1;
		else if (side2 > side1 && side2 > side3)
			longest = side2;
		else if (side3 > side1 && side3 > side2)
			longest = side3;
		
		return longest;
	}
}

