
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public String getName() {
		return name;
	}
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public double changePercent(double prev, double current) {
		return ((current - prev)/prev * 100);
	}
	
	public static void main(String[] args) {
		Stock google = new Stock("Google Inc.", "GOOG");
		google.setPreviousClosingPrice(1000);
		google.setCurrentPrice(2000);
		System.out.println("Name: " + google.getName() + " Symbol: " + google.getSymbol() + " Prev: " + google.getPreviousClosingPrice() + " Current: " + google.getCurrentPrice() + " Change: " + google.changePercent(google.getPreviousClosingPrice(), google.getCurrentPrice()) );
		
	}
	
	
}
