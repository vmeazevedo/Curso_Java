package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Inicializando uma var do tipo Product
		Product x;
		// Instanciando nossa classe
		x = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		x.name = sc.next();
		
		System.out.print("Price: ");
		x.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		x.quantity = sc.nextInt();
		
		System.out.println();
		System.out.print("Product data: " + x);
		System.out.println();
		
		// add produtos no estoque		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		x.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.print("Updated data:" + x);
		System.out.println();

		// removendo produtos do estoque
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		x.removeProducts(sc.nextInt());
		
		System.out.println();
		System.out.print("Updated data:" + x);
		
		sc.close();

	}

}
