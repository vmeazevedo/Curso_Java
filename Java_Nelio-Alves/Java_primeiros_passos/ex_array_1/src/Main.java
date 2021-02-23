import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		// inicializando o vetor
		double[] vet = new double[n];
		
		// salvando os inputs no vetor vet
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			vet[i] = x;
		}
		
		// iniciando as vars p e maior
		int p = 0;
		double maior = 0.0;
		
		// se meu vetor do loop for o maior ele salva na var maior
		// e salva a posição em p
		for (int i=0; i<n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				p = i;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(p);
		
		sc.close();

	}

}
