package exercicios_propostos2;
import java.util.Scanner;
import java.util.Locale;
public class Main4 {

	public static void main(String[] args) {
		// Ex5: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		// seguir, calcule e mostre o valor da conta a pagar.
		
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código do item:");
		int item = sc.nextInt();
		System.out.println("Informe a quantidade: ");
		int qtd = sc.nextInt();
		
		if (item==1) {
			double valor = 4.00 * qtd;
			System.out.printf("Total: %.2f%n", valor);
		}
		if (item==2) {
			double valor = 4.50 * qtd;
			System.out.printf("Total: %.2f%n", valor);
		}
		if (item==3) {
			double valor = 5.00 * qtd;
			System.out.printf("Total: %.2f%n", valor);
		}
		if (item==4) {
			double valor = 2.00 * qtd;
			System.out.printf("Total: %.2f%n", valor);
		}
		if (item==5) {
			double valor = 1.50 * qtd;
			System.out.printf("Total: %.2f%n", valor);
		}
		sc.close();
	}
}
