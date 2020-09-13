package operadores_atribuição_cumulativa;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe quantos minutos você consumiu: ");
		int minutos = sc.nextInt();
		double conta = 50;
		
		if (minutos<100) {
			System.out.println("Valor a pagar: R$ 50.00");
		} else {
			//conta = conta + ((minutos - 100) * 2);
			conta += ((minutos - 100) * 2);
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
		sc.close();
	}

}
