package lab09;

public class testBall {

	public static void main(String[] args) {
		
		Ball b1 = new Ball(2,2);
		
		System.out.println("B1 " + b1.toString());
		b1.move(3,-2);
		System.out.println("B1 " + b1.toString());
		b1.move(2,-7);
		System.out.println("B1 " + b1.toString());
		
		System.out.println("Distance travelled on X for b1 " + b1.getDistTraveledX());
		System.out.println("Distance travelled on Y for b1 " + b1.getDistTraveledY());

		Ball b2 = new Ball();
		
		System.out.println("B2 " + b2.toString());
		b2.move(7,-7);
		System.out.println("B2 " + b2.toString());
		b2.move(2,4);
		System.out.println("B2 " + b2.toString());
		
		System.out.println("Distance travelled on X for b2 " + b2.getDistTraveledX());
		System.out.println("Distance travelled on Y for b2 " + b2.getDistTraveledY());
		
	System.out.println("Distance travelled on X for all balls " + Ball.getTotDistXAllBalls());
	System.out.println("Distance travelled on Y for all balls " + Ball.getTotDistYAllBalls());


		
		
	}

}
