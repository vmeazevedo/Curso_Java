import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int vet[][] = new int[m][n];
		
		// primeiro for percorre as linhas
		// segundo for as colunas
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				vet[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(vet[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
