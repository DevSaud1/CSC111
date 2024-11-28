package lab08;

public class Stock {
	
	private String symbol;
	private String name;
	private double currentPrice;
	private double previosClosingPrice;
	
	public double getChange() {
		return previosClosingPrice - currentPrice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public void setCurrentPrice (double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public void setPreviosClosingPrice(double previosClosingPrice) {
		this.previosClosingPrice = previosClosingPrice;
	}
	
	public double getPreviosClosingPrice () {
		return this.previosClosingPrice;
	}
}
