import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// indicando o comprimento do meu vetor
		int n = sc.nextInt();
		// instanciando e iniciando o meu vetor com o valor n
		int vet[] = new int[n];
		
		// salvando os valores de input no meu vetor
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			vet[i] = x;
		}
		
		// inicializando um novo vetor e um contador
		int vet2[] = new int[n];
		int count = 0;
		
		// se o valor for par salvo o valor dele no vet2
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				vet2[i] = vet[i];
				count += 1;
			}
		}
		
		
		for (int i=0; i<n; i++) {
			if (vet2[i] == 0) {
				
			}
			else if (vet2[i] % 2 == 0) {
				System.out.print(vet2[i] + " ");
			}

			
		}
		
		System.out.println();
		System.out.println(count);
		
		
		
		sc.close();

	}

}
