import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int vet[] = new int[n];
		
		// salvando os valores no vetor
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			vet[i] = x;
		}
		
		// inicializando var e contador
		// salvando os valores pares na variavel
		int soma = 0;
		int count = 0;
		for (int i = 0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				count += 1;
			}
		}
		
		double media = (double) soma / count;
		
		System.out.println(media);
		
		sc.close();

	}

}
