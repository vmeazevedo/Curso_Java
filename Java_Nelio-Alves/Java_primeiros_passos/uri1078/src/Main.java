import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i;
		int cont = 0;
		int mult;
		
		n = sc.nextInt();
		
		// para cada i(vez) iniciando em 0
		// onde enquanto i for menor que 10
		// incrementando +1 a cada loop
		for (i=1; i<=10; i++) {
			cont += 1;	// aumento 1 no contador
			mult = cont * n;	// mult o cont pelo n
			System.out.println(cont + " x " + n + " = " + mult); 	// apresento a resposta
		}
		
		sc.close();

	}

}
