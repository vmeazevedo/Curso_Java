import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int vet[][] = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				vet[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL");
		for (int i=0; i<n; i++) {
			System.out.print(vet[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (vet[i][j] < 0) {
					count =+ 1;
				}
			}
		}
		
		System.out.println("QUANTIDADE DE NEGATIVSO = " + count);
		sc.close();
	}
}

