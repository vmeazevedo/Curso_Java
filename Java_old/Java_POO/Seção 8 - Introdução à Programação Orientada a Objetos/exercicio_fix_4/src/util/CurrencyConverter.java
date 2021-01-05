package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.00 / 100;
	public double dollar_price;
	public double dollars;
	
	public double total() {
		return dollar_price * dollars;
	}
	
	public double calc_iof(double iof) {
		return IOF * total();
	}
	
}
