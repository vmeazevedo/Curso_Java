package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter c = new CurrencyConverter();
		
		System.out.print("Whats is the dollar price? ");
		c.dollar_price = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		c.dollars = sc.nextDouble();
		
		double iof = CurrencyConverter.IOF;
		System.out.printf("Amount to be paid in reais = %.2f%n", (c.total() + c.calc_iof(iof)));
		
		
		sc.close();
	}

}
