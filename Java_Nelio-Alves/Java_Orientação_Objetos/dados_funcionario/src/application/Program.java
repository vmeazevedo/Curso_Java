package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee dado;
		dado = new Employee();
		
		System.out.print("Name: ");
		dado.name = sc.nextLine();
		System.out.print("Gross salary: ");
		dado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		dado.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + dado);
		System.out.println();
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		dado.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.print("Updated data: " + dado);
		System.out.println();
		
		
		sc.close();

	}

}
