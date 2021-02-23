import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		double mat[][] = new double [m][n];
		
		// montando a minha matriz
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		
		// criando vetor com a soma da linha
		double vet1[] = new double[m];
		double x = 0.0;
		double y = 0.0;
		
		for (int i=0; i<n; i++) {
			x += mat[0][i]; 
			y += mat[1][i];
		}
		
		vet1[0] = x;
		vet1[1] = y;
		
		for (int i=0; i<m; i++) {
			System.out.println(vet1[i]);
		}
		
		
		sc.close();

	}

}
