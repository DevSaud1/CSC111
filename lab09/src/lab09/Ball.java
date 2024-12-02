package lab09;

public class Ball {
	
	private double x; 
	private double y;
	private double distTraveledX;
	private double distTraveledY;
	private static double totDistXAllBalls;
	private static double totDistYAllBalls;
	public static double lastX;
	public static double lastY;
	
	public Ball() {
		
	}
	
	public Ball (double newX, double newY) {
		x = newX;
		y = newY;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void move(double xDisp, double yDisp) {

        if ( x+xDisp == lastX && y+yDisp == lastY ){
            System.out.println("The ball in position (" + x + "," + y + ") cannot move to position (" + (x + xDisp)+ "," + (y + yDisp) + ")");
        } 
        else {
            x += xDisp;
            y += yDisp;

            this.distTraveledX += Math.abs(xDisp);
            this.distTraveledY += Math.abs(yDisp);
            totDistXAllBalls += Math.abs(xDisp);
            totDistYAllBalls += Math.abs(yDisp);

            lastX = x;
            lastY = y;
		}
		
	}
	
	public double getDistTraveledX() {
		return this.distTraveledX;
	}
	
	public double getDistTraveledY() {
		return this.distTraveledY;
	}
	
	public static double getTotDistXAllBalls() {
		return totDistXAllBalls;
	}
	
	public static double getTotDistYAllBalls() {
		return totDistYAllBalls;
	}
	
	public String toString() {
		return "Ball @ ("+ x +","+ y +")";
	}

}