package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// indicamos quantos itens vão ter em nosso vetor
		int n = sc.nextInt();
		// iniciamos o nosso vetor Product
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			// recebemos os dados e colocamos ele em nosso construtor
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			// utilizamos o getters para somar somente os valores
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}