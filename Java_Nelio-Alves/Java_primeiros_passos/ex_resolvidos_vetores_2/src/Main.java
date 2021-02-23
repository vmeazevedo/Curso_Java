import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		double[] vet;
		vet = new double[n];
		
		double soma = 0;
		
		// leitura das inputs
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			vet[i] = x;
		}
		
		// printando os valores dos vetores
		for (int i=0; i<n; i++) {
			System.out.print(vet[i] + " ");
		}
		
		// salvando os valores na var soma
		for (int i=0; i<n; i++) {
			soma += vet[i];
		}
		
		System.out.println();
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", (soma/n));
		
		sc.close();

	}

}
