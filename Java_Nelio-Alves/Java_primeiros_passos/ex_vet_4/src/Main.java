import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double vet[] = new double[n];
		
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			vet[i] = x;
		}
		
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vet[i];
		}

		double media = soma / n;
		System.out.println(media);
		
		// verificando se algum input é menor que a media
		for (int i=0; i<n; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		
		sc.close();

	}

}
