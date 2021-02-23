import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String veta[] = new String[n];
		int vetb[] = new int[n];

		// colocando os valores dentro dos vetores
		for (int i=0; i<n; i++) {
			String x = sc.next();
			veta[i] = x;
			int y = sc.nextInt();
			vetb[i] = y;
			
		}
		
		// logica para verificar a pessoa mais velha
		int maior = 0;
		String pessoa = "";
		for (int i=0; i<n; i++) {
			if (vetb[i] > maior) {
				maior = vetb[i];
				pessoa = veta[i];
			}
		
		}
		
		System.out.println("Pessoa mais velha: " + pessoa);
	}
}

