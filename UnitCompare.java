import java.util.Scanner;

public class UnitCompare {
	
	public static void main (String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the units (km_mile, kg_lb, C_F): ");
		String unit = read.next();
		
		if (unit.equalsIgnoreCase("km_mile")) { // first compare unit
			
			System.out.print("Enter two numbers: "); // read km and mile
			double km = read.nextDouble();
			double mile = read.nextDouble(); 
			
			double km_to_mile = km / 1.60934; // convert units
			double mile_to_km = mile * 1.660934;
			
			if (km > mile_to_km)  // compare inputs
				System.out.printf("%.1f km is greater than %.6f km", km ,mile_to_km);
			else if (km < mile_to_km)
				System.out.printf("%.1f miles is greater than %.6f miles", mile ,km_to_mile);
			else
				System.out.printf("%.1f km is equals to %.6f miles", km, mile);
	
		}else if (unit.equalsIgnoreCase("kg_lb")) { // second compare unit 
			
			System.out.print("Enter two numbers: "); // read kg and bound
			double kg = read.nextDouble();
			double lb = read.nextDouble();
			
			double kg_to_lb = kg * 2.20462; // convert units
			double lb_to_kg = lb / 2.20462;
			
			if (kg > lb_to_kg) // compare values
				System.out.printf("%.1f kg is greater than %.6f kg", kg, lb_to_kg);
			else if (kg < lb_to_kg)
				System.out.printf("%.1f lb is greater than %.6f lb", lb, kg_to_lb);
			else
				System.out.printf("%.1f kg is equals to %.6f lb", kg, lb);
			
		}else if (unit.equalsIgnoreCase("C_F")) { // third compare unit
			
			System.out.print("Enter two numbers: "); // read celsius and fahrenheit
			double cel = read.nextDouble();
			double fah = read.nextDouble();
			
			double cel_to_fah = ( ( 9/5.0 ) * cel ) + 32; // convert units 
			double fah_to_cel = ( 5/9.0 ) * ( fah - 32 );
			
			if (cel > fah_to_cel) // compare values
				System.out.printf("%.1f C is greater then %.1f C", cel, fah_to_cel);
			else if (cel < fah_to_cel)
				System.out.printf("%.1f F is greater then %.1f F", fah, cel_to_fah);
			else
				System.out.printf("%.1f C is equals to %.1f F", cel, fah);
			
		}else // if the user enter something else then the available compare units 
			System.out.println("Invalid operation");
	}
	
}
