import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int[] vet;
		vet = new int[n];
		
		// inputo numeros em um vetor
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			vet[i] = x;
		}
		
		// se os valores forem negativos apresentamos eles
		for (int i=0; i<n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
			
				
	}

		
		sc.close();

	}

}
