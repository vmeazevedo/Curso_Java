package exercicios_propostos4;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		// Ex6: Ler um número inteiro N e calcular todos os seus divisores.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		for (int i=1; i<=n; i++) {
			res = n%i;
			if (res==0) {
				System.out.println(i);
			}
		sc.close();
		}

	}

}
