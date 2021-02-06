import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,x;
		int soma = 0;
		
		n = sc.nextInt();	// quantidade de valores a serem lidos
		
		// para cada i(vez) iniciando em 0
		// onde enquanto i for menor que n
		// incrementando +1 a cada loop
		for (int i=0; i<n; i++) {
			x = sc.nextInt();	// vou ler um novo valor
			soma += x;	// somar o valor lido na var_soma
		}
		
		System.out.println(soma);
		
		sc.close();
		

	}

}
