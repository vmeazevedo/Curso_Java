import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int cont_alcool = 0;
		int cont_gasolina = 0;
		int cont_diesel = 0;
		int tipo;
		
		tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				cont_alcool += 1;
				tipo = sc.nextInt();
			}
			else if (tipo == 2) {
				cont_gasolina += 1;
				tipo = sc.nextInt();
			}
			else if (tipo == 3) {
				cont_diesel += 1;
				tipo = sc.nextInt();
			}
			else if (tipo == 4) {
				break;
			}
			else if ( tipo > 4) {
				tipo = sc.nextInt();
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + cont_alcool);
		System.out.println("Gasolina: " + cont_gasolina);
		System.out.println("Diesel: " + cont_diesel);
		
		sc.close();

	}

}
