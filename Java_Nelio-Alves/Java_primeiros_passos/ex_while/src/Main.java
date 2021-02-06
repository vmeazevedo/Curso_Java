import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) { // enquanto o x for diferente de 0
			soma = soma + x;	// soma o valor de x com a var_soma
			x = sc.nextInt();	// solicita um novo input de entrada
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
