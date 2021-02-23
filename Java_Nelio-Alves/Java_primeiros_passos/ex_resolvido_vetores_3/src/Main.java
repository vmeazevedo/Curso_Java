import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();		
		
		String[] nome;
		int[] idade;
		double[] altura;
		
		nome = new String[n];
		idade = new int[n];
		altura = new double[n];
		
		// salvando os nomes, idade e altura no vetor
		for (int i=0; i<n; i++) {
			
			String x = sc.next();
			nome[i] = x;
			
			int x1 = sc.nextInt();
			idade[i] = x1;
			
			double x2 = sc.nextDouble();
			altura[i] = x2;
		}
		
		// salvando os valores das alturas na var soma
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += altura[i];
		}
		
		// criando um contador para salvar qtos menos de 16 tem 
		int cont=0;
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				cont += 1;
			}
		}
		
		System.out.printf("Altura média: %.2f%n", (soma/n));
		
		double p;
		p = (double) cont/n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (p*100.0));
		
		
		sc.close();

	}

}
