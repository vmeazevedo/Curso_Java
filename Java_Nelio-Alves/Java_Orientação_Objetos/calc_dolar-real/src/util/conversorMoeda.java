package util;

public class conversorMoeda {
	
	public double dollar;
	public double m_dollar;
	
	// informando que o valor de nosso iof vai ser static
	public static double IOF = 6.0/100.0;
	
	// descobrindo o valor total
	public double total() {
		return this.dollar * this.m_dollar;
	}
	
	// descobrindo o valor a ser pago + iof
	public double paid() {
		return total() + (total() * IOF);
	}
	
	// formatando a saida
	public String toString() {
		return String.format("%.2f%n", paid());
	}
}
