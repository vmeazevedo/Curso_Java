package application;

import java.util.Locale;
import java.util.Scanner;

import util.Operações;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// entrando com os dados a serem colocados no construtor
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		// verificando se é um deposito inicial
		System.out.print("Is there an initial deposit (y/n)? ");
		String choice = sc.next();
		
		double deposit = 0.0;
		if (choice.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
		}
		
		// add dados no construtor
		Operações op = new Operações(number, holder, deposit);
		
		// apresentando os dados da conta
		System.out.println("\nAccount data: ");
		System.out.println(op);
		
		// realizando um deposito
		System.out.print("\nEnter a deposit value: ");
		op.depositValue(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(op);
		
		// realizando um saque
		System.out.print("Enter a withdraw value: ");
		op.withdrawValue(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(op);
		
		
		sc.close();

	}

}
