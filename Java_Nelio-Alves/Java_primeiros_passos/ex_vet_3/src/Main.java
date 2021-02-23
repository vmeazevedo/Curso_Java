import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int veta[] = new int[n];
		int vetb[] = new int[n];
		int vetc[] = new int[n];
		
		// loop para prencher o veta
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			veta[i] = x;
		}
		
		// loop para prencher o vetb		
		for (int i=0; i<n; i++) {
			int y = sc.nextInt();
			vetb[i] = y;
		}

		
		// loop para prencher o vetb
		for (int i=0; i<n; i++) {
			vetc[i] = veta[i] + vetb[i];
		}
		
		// imprimindo o vetor c
		for (int i=0; i<n; i++) {
			System.out.print(vetc[i] + " ");
		}
		
		
		sc.close();
		

	}

}
