package exercicios_propostos1;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// Ex5: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peça1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int peça2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
