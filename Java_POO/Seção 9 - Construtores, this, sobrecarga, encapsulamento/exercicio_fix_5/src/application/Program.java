package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bk = new BankAccount();
	
		System.out.print("Enter account number: ");
		bk.number = sc.nextInt();
		System.out.print("Enter account holder: ");
		bk.holder = sc.next();
		
		System.out.println("GetNumber: " + bk.getNumber());
		System.out.println("GetHolder: " + bk.getHolder());
		System.out.print("SetHolder: ");
		bk.setHolder("Morpheus");
		System.out.println("ShowNewHolder: " + bk.getHolder());
		
		System.out.println();
		System.out.print("Is there an initial deposit [y/n]? ");
		char resp;
		resp = sc.next().charAt(0);
		if (resp == 'n') {
			System.out.println();;
		} else {
			System.out.print("Enter a deposit value: ");
			bk.deposit = sc.nextDouble();
		}
				
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account "+ bk.number + ", Holder: "+ bk.holder + ", Balance: $ %.2f%n " , bk.deposit);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		bk.depositValue = sc.nextDouble();
		System.out.print("Updated account data: ");
		System.out.printf("Account "+ bk.number + ", Holder: "+ bk.holder + ", Balance: $ %.2f%n " , (bk.deposit + bk.depositValue));
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		bk.withdrawValue = sc.nextDouble();
		System.out.println("Updated account data: ");
		System.out.printf("Account "+ bk.number + ", Holder: "+ bk.holder + ", Balance: $ %.2f%n " , (((bk.deposit + bk.depositValue)-(bk.withdrawValue)) - BankAccount.TAX));
						
		sc.close();

	}

}
