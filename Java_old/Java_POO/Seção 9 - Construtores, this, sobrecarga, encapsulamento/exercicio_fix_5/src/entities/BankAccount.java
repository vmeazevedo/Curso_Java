package entities;

public class BankAccount {
	
	public static final double TAX = 5.00;
	public int number;
	public String holder;
	public double deposit;
	public double depositValue;
	public double withdrawValue;
	
	public BankAccount() {
	}
	
	public BankAccount(int number, String holder, double deposit, double depositValue, double withdrawValue) {
		super();
		this.number = number;
		this.holder = holder;
		this.deposit = deposit;
		this.depositValue = depositValue;
		this.withdrawValue = withdrawValue;
	}

	// Encapsulamento
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// Metodos do meu código
	public double initialDeposit() {
		return deposit;
	}
	public double enterDeposit() {
		return depositValue;
	}
	public double removeDeposit() {
		return withdrawValue;
	}
	
}
	


