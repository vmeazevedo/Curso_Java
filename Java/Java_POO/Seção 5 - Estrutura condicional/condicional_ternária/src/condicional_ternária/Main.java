package condicional_ternária;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do produto: ");
		double valor = sc.nextDouble();
		System.out.println("Calculando desconto.");
		double desconto = (valor<20.0) ? valor*0.1 : valor*0.05;
		System.out.println("Seu desconto é de: " + desconto);
		sc.close();
	}

}
