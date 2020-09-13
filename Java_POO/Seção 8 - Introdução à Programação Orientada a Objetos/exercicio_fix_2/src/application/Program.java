package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.name + ", $ " + emp.NetSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double perc = sc.nextDouble();
		emp.IncreaseSalary(perc);
		
		System.out.println();
		System.out.print("Updated data: " + emp);
				
		sc.close();
	}

}
