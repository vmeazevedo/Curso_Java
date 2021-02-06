import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		double media;
		int cont = 0;
		
		// Le um valor de entrada
		x = sc.nextInt();
		if (x < 0) {	// se o valor for negativo informa que é impossivel calc
			System.out.println("impossivel calcular");
		}
		
		// enquanto o valor for positivo
		while (x > 0) {
			soma = soma + x;	// realizo as somas dos valores inputados
			cont = cont + 1;	// faço um contador para dividir na media
			x = sc.nextInt();	// peço um novo input de dados
			if (x < 0) {	// se o num for negativo
				media = (double) soma / cont;	// realizo a media dos valores inputados
				System.out.printf("%.2f%n",media);	// apresento o resultado
			}
		}
	
		sc.close();
	}
		
}

