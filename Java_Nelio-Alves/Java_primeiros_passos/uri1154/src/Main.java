import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int cont = 0;
		int soma = 0;
		double media;
		
		idade = sc.nextInt();
		
		while (idade >= 0) {
			soma += idade;
			cont += 1;
			idade = sc.nextInt();
		}
		
		media = (double) soma / cont;
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}

}
