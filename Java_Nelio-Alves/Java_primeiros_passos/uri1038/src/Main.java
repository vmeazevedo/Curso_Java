import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cachorro_quente = 4.0;
		double x_salada = 4.5;
		double x_bacon = 5;
		double torrada_simples = 2.0;
		double refrigerante = 1.5;
		int cod, qt;
		double valor;
		
		cod = sc.nextInt();
		qt = sc.nextInt();
		
		switch (cod) {
			case 1:
				valor = cachorro_quente * qt;
				System.out.printf("Total: R$ %.2f%n", valor);
				break;
			case 2:
				valor = x_salada * qt;
				System.out.printf("Total: R$ %.2f%n", valor);
				break;
			case 3:
				valor = x_bacon * qt;
				System.out.printf("Total: R$ %.2f%n", valor);
				break;
			case 4:
				valor = torrada_simples * qt;
				System.out.printf("Total: R$ %.2f%n", valor);
				break;
			case 5:
				valor = refrigerante * qt;
				System.out.printf("Total: R$ %.2f%n", valor);
				break;
				
		}
		
		sc.close();
		

		}
	}



