package util;

public class Operações {

	private int number;
	private String holder;
	private double deposit;
	public static double TAX = 5.00;
	
	// Construtor
	public Operações(int number, String holder, double deposit) {
		this.number = number;
		this.holder = holder;
		this.deposit = deposit;
	}	
	
	// retorna o meu saldo
	public double balance() {
		return this.deposit;
	}
	
	// realiza um deposito
	public double depositValue(double value) {
		return deposit += value;
	}
	
	// realiza um saque
	public double withdrawValue(double value) {
		return deposit = (deposit - value) - TAX;
	}

	
	public String toString() {
		return "Account "
				+ getNumber()
				+ ", Holder: "
				+ getHolder()
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance());
				
	}
	
	// encapsulamento
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}


}
