import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double vet_altura[] = new double[n];
		String vet_sexo[] = new String[n];
		
		// criando a massa 
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			vet_altura[i] = x;
			String y = sc.next();
			vet_sexo[i] = y;
		}
		
		// verificando a menor altura
		double menor = 2.10;
		for (int i=0; i<n; i++) {
			if (vet_altura[i] < menor) {
				menor = vet_altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menor);
		
		// verificando a maior altura
		double maior = 0.0;
		for (int i=0; i<n; i++) {
			if (vet_altura[i] > maior) {
				maior = vet_altura[i];
			}
		}
		
		System.out.printf("Maior altura = %.2f%n", maior);
		
		// verificando a media de altura das mulheres
		double soma = 0.0;
		double media = 0.0;
		int count = 0;
		for (int i=0; i<n; i++) {
			if (vet_sexo[i].equals("F")) {
				soma += vet_altura[i];
				count += 1;
			}
		}
		
		media = (double) soma / count;
		System.out.printf("Media das altura das mulheres = %.2f%n", media);
		
		// verificando a quantidade de homens
		int count2 = 0;
		for (int i=0; i<n; i++) {
			if (vet_sexo[i].equals("M")) {
				count2 += 1;
			}
		}
		
		System.out.println("Numero de homens = " + count2);
		
		sc.close();

	}

}
